//kadane's approach
//core concept: at every index we decide whether the current index should be included inthe sub array or a fresh new subarray should start
public class kadaneMaxsum {
    public static int calculateMaxSum(int[] arr){
        //track two variabls : currSum, maxSum
        int currSum = arr[0];
        int maxSum = arr[0];
        int start = 0;
        int end = 0;
        int tempstart = 0;
        for(int i=1; i<arr.length; i++){
             if(arr[i] > currSum + arr[i]){
                currSum = arr[i];
                tempstart = i;
            } else {
                currSum = currSum + arr[i];
            }
            if(currSum > maxSum){
                maxSum = currSum;
                start = tempstart;
                end = i;
            }
        }
        System.out.print("The subarray is: ");
        for(int i= start; i<=end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return maxSum;
    }
    public static void main(String args[]){
        int[] arr = { 2, -3, 8, -4, 2, -1, 5, -1};
        int maxSum = calculateMaxSum(arr);
        System.out.println("Maximum subarray sum : " + maxSum);
    }
}

// public class kadaneMaxsum {
//     public static int maxSumSubarray(int[] arr) {
//         int curr_sum = 0;
//         int max_sum = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             curr_sum = curr_sum + arr[i];
//             if (curr_sum < 0) {
//                 curr_sum = 0;
//             }
//             max_sum = Math.max(max_sum, curr_sum);
//         }
//         return max_sum;
//     }

//     public static void main(String args[]) {
//         int arr[] = { -2, -3, 4, -2, -1, 5, -3 };
//         int max = maxSumSubarray(arr);
//         System.out.println("max sum : " + max);
//     }
// }



