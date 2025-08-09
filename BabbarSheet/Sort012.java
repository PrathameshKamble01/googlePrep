// package BabbarSheet;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 0, 1, 2};
        sort012(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                System.out.println("Swapping " + arr[low] + " and " + arr[mid]);
                swap(arr, low++, mid++);
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                System.out.println("Swapping " + arr[mid] + " and " + arr[high]);
                swap(arr, mid, high--);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
