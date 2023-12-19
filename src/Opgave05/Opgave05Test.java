package Opgave05;

import java.util.ArrayList;

public class Opgave05Test {
    public static void main(String[] args) {
        System.out.println(sqrtNumberBinary(7));


    }

    public static int sqrtNumber(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (Math.pow(i, 2) <= n && n < Math.pow((i+1), 2))
                result = i;
        }
        return result;

    }

    public static int sqrtNumberBinary(int n) {
        int indeks = -1;
        int left = 0;
        int right = n - 1;
        while (indeks == -1 && left <= right) {
            int middle = (left + right) / 2;
            int k = middle;
            if (Math.pow(k, 2) <= n && n < Math.pow((k + 1), 2)) {
                indeks = middle;
            }
            else {
                if (Math.pow(k + 1, 2) <= n)
                    left = middle + 1;
                else
                    right = middle - 1;
            }
        }
        return indeks;
    }

}


