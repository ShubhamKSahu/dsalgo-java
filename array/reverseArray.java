import java.util.*;

public class reverseArray {
    public static int[] reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int revArr[] = reverse(arr);
        System.out.println("Reversed array is: " + Arrays.toString(revArr));
    }
}
