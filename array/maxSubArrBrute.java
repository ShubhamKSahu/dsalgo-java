public class maxSubArrBrute {
    public static void maxSubArr(int[] arr) {
        int max_sum = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int curr_sum = 0;
                for (int k = start; k <= end; k++) {
                    curr_sum += arr[k];
                }
                System.out.println(curr_sum);
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;

                }
            }
        }
        System.out.println("max_sum is : " + max_sum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, -1, 7 };
        maxSubArr(arr);
    }

}
