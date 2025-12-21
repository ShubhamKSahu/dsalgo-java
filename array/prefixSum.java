public class prefixSum {
    public static int maxSumSubarray(int[] arr) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int max_sum = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {
            int curr_sum;
            for (int end = start; end < arr.length; end++) {
                if (start == 0) {
                    curr_sum = prefix[end];
                } else {
                    curr_sum = prefix[end] - prefix[start - 1];
                }
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                }
            }
        }
        return max_sum;
    }

    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int max = maxSumSubarray(arr);
        System.out.println("max sum of subarray is: " + max);
    }
}
