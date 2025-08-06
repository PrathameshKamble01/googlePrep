// package SortingAlgo;

class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int[] arr = { 1,2,3,4,5,6 };
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Traverse through all array elements
        int didSwap = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    didSwap = 1;
                }   
            }
        }
        if(didSwap == 0) {
            return; // If no two elements were swapped by inner loop, then return
        }
        System.out.println("Runs");
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}