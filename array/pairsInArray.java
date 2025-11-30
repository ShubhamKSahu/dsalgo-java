public class pairsInArray {
    public static void arrayPairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 12, 23, 34, 45, 56, 67, 78 };
        arrayPairs(arr);
    }
}
