package Array;

public class moveNegative {
    public void sortNeg(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        while (mid <= n - 1) {
            if (arr[mid] < 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else {
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        moveNegative ob = new moveNegative();
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        ob.sortNeg(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
