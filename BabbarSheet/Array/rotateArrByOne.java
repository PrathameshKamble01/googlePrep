package Array;

import java.util.*;

public class rotateArrByOne {
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        // rotateArrByOne ob = new rotateArrByOne();
        int arr[] = { 1, 2, 3, 4, 5 };
        int len = arr.length;
        rotateArray(arr, len);
        System.out.println("Array after rotation by one position: " + Arrays.toString(arr));
    }
}
