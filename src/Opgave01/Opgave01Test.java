package Opgave01;

public class Opgave01Test {
    public static void main(String[] args) {
        int[] intArray = {2, 4, 16, 8, 10};
        boolean result = containsUnevenNumber(intArray);
        printResult(result);
        int [] intArray2 = { 42, 67, 12, 103 };
        result = containsUnevenNumber(intArray2);
        printResult(result);
        System.out.println(firstNumberBetween10And15(intArray));
        System.out.println(firstNumberBetween10And15(intArray2));

    }

    private static void printResult(boolean result) {
        if (result) {
            System.out.println("Listen indeholder et ulige tal.");
        } else {
            System.out.println("Listen indeholder ikke et ulige tal.");
        }
    }

    public static boolean containsUnevenNumber(int[] candidates) {
        boolean found = false;
        int i = 0;
        while (!found && i < candidates.length) {
            int k = candidates[i];
            if (k % 2 == 1)
                found = true;
            else
                i++;
        }
        return found;
    }

    public static int firstNumberBetween10And15(int[] candidates) {
        int result = -1;
        for (int i = 0; i < candidates.length; i++) {
            int k = candidates[i];
            if (k >= 10 && k <= 15) {
                result = k;
                return i;
            }
        }
        return -1;
        }

}
