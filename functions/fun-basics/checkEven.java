import java.util.*;
public class checkEven {
    public static void isEven(int n){
        boolean isEven = true;
        if(n%2 != 0){
            isEven = false;
        }
        if(isEven == true){
            System.out.println(n + " is an even number");
        }else {
            System.out.println(n + " is not an even number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        isEven(n);
    }}
    

