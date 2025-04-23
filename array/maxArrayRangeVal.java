import java.util.*;

public class maxArrayRangeVal {
    static int maxRangeVal(int arr[], int index1, int index2){
        int max = arr[index1];
        for(int i=index1+1; i<=index2; i++){
            if(arr[i]> max){
                max = arr[i];
            }  
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the "+ n + " elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = maxRangeVal(arr, 2, 5);
        System.out.println("Max array value within 2 and 5 index range is: "+ ans);
    }
}
