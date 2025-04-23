import java.util.*;
public class reverseArray {
    static void reverseArr(int [] arr){
        int startPoint = 0;
        int endPoint = arr.length-1;
       while(startPoint < endPoint){
            int temp = arr[startPoint];
            arr[startPoint] = arr[endPoint];
            arr[endPoint] = temp;
            startPoint++;
            endPoint--;
        }
    }
        public static void main(String args[]){
            int[] arr = {2, 4, 5, 7, 9, 10};
            reverseArr(arr);
            System.out.println("Reverse array is : " + Arrays.toString(arr));
        }
}
