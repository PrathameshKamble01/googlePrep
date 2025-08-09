public class MoveNegativeToStart {
    public static void main(String[] args) {
        // int[] arr = {1, -2, 3, -4, 5, -6, 7};
        int[] arr = {0,0,0,0};
        moveNegativeToStart(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveNegativeToStart(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int start = 0, end = arr.length - 1;
        for(int i = 0; i < arr.length; i++) {
                while (start <= end) {
                if(arr[start] < 0){
                    start++;                   
                }
                else if(arr[end] >= 0){
                    end--;
                }
                else {
                    System.out.println("Swapping " + arr[start] + " and " + arr[end]);
                    swap(arr, start, end);
                    start++;
                    end--;
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

