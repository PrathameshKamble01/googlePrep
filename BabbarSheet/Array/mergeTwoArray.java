package Array;

import java.util.Arrays;

public class mergeTwoArray {
    // // brute approach 1
    // public static void mergeArr(int[] arr1, int[] arr2, int[] arr3) {

    // int i = 0, j = 0, k = 0;

    // while (i < arr1.length && j < arr2.length) {
    // if (arr1[i] < arr2[j]) {
    // arr3[k++] = arr1[i++];
    // } else {
    // arr3[k++] = arr2[j++];
    // }
    // }

    // while (i < arr1.length) {
    // arr3[k++] = arr1[i++];
    // }

    // while (j < arr2.length) {
    // arr3[k++] = arr2[j++];
    // }
    // }

    // // Striver Brute
    // public static void merge(long[] arr1, long[] arr2, int n, int m) {
    // long[] arr3 = new long[n + m];
    // int left = 0;
    // int right = 0;
    // int index = 0;

    // while (left < n && right < m) {
    // if (arr1[left] < arr2[right]) {
    // arr3[index] = arr1[left];
    // left++;
    // index++;
    // } else {
    // arr3[index] = arr2[right];
    // right++;
    // index++;
    // }
    // }

    // while (left < n) {
    // arr3[index++] = arr1[left++];
    // }

    // while (right < m) {
    // arr3[index++] = arr2[right++];
    // }

    // for (int i = 0; i < n + m; i++) {
    // if (i < n) {
    // arr1[i] = arr3[i];
    // } else {
    // arr2[i - n] = arr3[i];
    // }
    // }
    // }

    public static void merge(long[] arr1, long[] arr2, int n, int m) {
        int left = n - 1;
        int right = 0;

        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        long[] arr1 = { 1, 2, 3, 4, 5 };
        long[] arr2 = { 6, 7, 8, 9, 10 };
        int n = arr1.length;
        int m = arr2.length;
        merge(arr1, arr2, n, m);
        // int[] arr3 = new int[arr1.length + arr2.length];
        // mergeArr(arr1, arr2, arr3);

        // for (int value : arr3)
        // System.out.print(value + " ");

        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

    }
}
