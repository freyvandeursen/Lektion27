package Opgave07;

public class Opgave07Test {
    public static void main(String[] args) {
        System.out.println(findesK("jubiiiiiiiii", 9));

    }

    public static boolean findesK(String string, int tal) {
        int repeat = 0;
        int repeatInstance = 0;
        int i = 0;
        while (i < string.length() - 1) {
            String j = String.valueOf(string.charAt(i));
            String y = String.valueOf(string.charAt(i + 1));
            if (j.compareTo(y) == 0) {
                repeatInstance++;
                if (repeatInstance > repeat)
                    repeat = repeatInstance;
            }
            else if (j != y)
                repeatInstance = 0;

            i++;
        }
        if (String.valueOf(string.charAt(string.length() - 1)).compareTo(String.valueOf(string.charAt(string.length() - 2))) == 0)
            repeat++;
        return repeat == tal;
    }
}
