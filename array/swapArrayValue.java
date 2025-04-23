import java.util.*;

public class swapArrayValue {
    static void swapArray(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array before swaping: "+ Arrays.toString(arr));
        swapArray(arr,0, 2);
        System.out.println("Array after swaping: "+ Arrays.toString(arr));

    }
}
