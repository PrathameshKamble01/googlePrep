package Array;

import java.util.*;

public class kthMinMax {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 4, 54, 78 };
        int k = 3;
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }
}
