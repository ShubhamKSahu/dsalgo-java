public class binarySearch {
    public static int binary(int numbers[], int target) {
        int start = 0;
        int end = numbers.length - 1;
        while ((start <= end)) {
            int mid = (start + end) / 2;
            if (target == numbers[mid]) {
                return mid;
            }
            if (target > numbers[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 19;
        int index = binary(numbers, target);
        System.out.println("Target found at index: " + index);
    }
}
