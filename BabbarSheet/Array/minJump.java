package Array;

public class minJump {
    static int jump(int[] arr, int n) {
        if (n <= 1)
            return 0;
        if (arr[0] == 0)
            return -1;
        int jump = 0;
        int pos = 0;
        int des = 0;

        for (int i = 0; i < n - 1; i++) {
            des = Math.max(des, arr[i] + i);

            if (pos == i) {
                pos = des;
                jump++;
                if (pos >= n - 1)
                    break;
                if (pos <= i)
                    return -1;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int n = arr.length;
        int res = jump(arr, n);
        System.out.println(res);
    }
}
