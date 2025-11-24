public class largestInArray {
    public static int largestNum(int numbers[], int largestNum) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNum) {
                largestNum = numbers[i];
            }

        }
        return largestNum;
    }

    public static void main(String args[]) {
        int numbers[] = { 23, 45, 234, 56, 46, 157, 36, 67, 78 };
        int largestNum = numbers[0];
        int largestNumber = largestNum(numbers, largestNum);
        System.out.println("Largest number is: " + largestNumber);
    }
}