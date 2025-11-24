import java.util.*;
public class linearSearch {
    public static int linearSearchMethod(int numbers[], int key){
        for(int i=0; i<numbers.length; i++ ){
            if(numbers[i] == key){
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {23, 17, 26, 57, 78, 59};
        int key = 57;
        int index = linearSearchMethod(numbers, key);
        System.out.println("The number found at index: " + index);
    }
}
