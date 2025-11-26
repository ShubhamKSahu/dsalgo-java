public class largestInArray {
    public static int largestNum(int numbers[]) {
        int largestNum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largestNum < numbers[i]) {
                largestNum = numbers[i];
            }
        }
        return largestNum;
    }

    public static void main(String args[]) {
        int numbers[] = { 12, 23, 43, 455, 35, 23, 34, 445 };
        int largestNum = largestNum(numbers);
        System.out.println("Largest number from the given array is: " + largestNum);
    }
}