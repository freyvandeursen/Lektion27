package Opgave03;

public class Opgave03Test {
    public static void main(String[] args) {
        int[] testArray1 = { 23, 54, 23, 975, 2, 13 }; //false
        int[] testArray2 = { 42, 51, 45, 45, 42, 17 }; //true

        System.out.println(twoAfterEachOther(testArray1));
        System.out.println(twoAfterEachOther(testArray2));
    }

    public static boolean twoAfterEachOther(int[] candidates) {
        boolean found = false;
        int i = 0;
        int number1 = 0;
        int number2 = 0;
        while (i < candidates.length-1 && !found) {
            number1 = candidates[i];
            number2 = candidates[i + 1];
            if (number1 == number2)
                found = true;
            else
                i++;
        }
        return found;
    }
}
