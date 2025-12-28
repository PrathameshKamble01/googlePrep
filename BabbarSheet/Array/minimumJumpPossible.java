package Array;

import java.util.*;

public class minimumJumpPossible {
    static boolean numJump(int[] arr, int n) {
        int maxfind = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (i > maxfind)
                return false;
            maxfind = Math.max(maxfind, i + arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int n = arr.length;

        System.out.print("Array representing maximum jump from each index: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        boolean ans = numJump(arr, n);

        if (ans) {
            System.out.println("It is possible to reach the last index.");
        } else {
            System.out.println("It is not possible to reach the last index.");
        }

    }
}
