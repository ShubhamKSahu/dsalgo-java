public class sumOfSubarrays {
    public static void subArraySum(int arr[]) {

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]);
                    sum = sum + arr[k];
                }
                System.out.println(" => Sum is: " + sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        subArraySum(arr);
    }
}
