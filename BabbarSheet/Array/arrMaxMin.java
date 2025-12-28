package Array;

import java.io.*;

public class arrMaxMin {
    public static int getMax(int[] arr, int n) {
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            res = Math.max(res, arr[i]);
        }
        return res;
    }

    public static int getMin(int[] arr, int n) {
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            res = Math.min(res, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7, 8 };
        System.out.println("The original array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int n = arr.length;
        // getMax(arr, n);
        System.out.println("Minimum element of array: " + getMin(arr, n));
        System.out.println("Maximum element of array: " + getMax(arr, n));
    }
}