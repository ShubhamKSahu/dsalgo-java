public class kadaneMaxsum {
    public static int maxSumSubarray(int[] arr) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curr_sum = curr_sum + arr[i];
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -2, -1, 5, -3 };
        int max = maxSumSubarray(arr);
        System.out.println("max sum : " + max);
    }
}
