 import java.util.*;
 public class avgOfThreeNumber{
    public static int avgOfThreeNum(int num1, int num2, int num3){
        int avg = (num1 + num2 + num3)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int avg = avgOfThreeNum(num1, num2, num3);
        System.out.println("Average of 3 numbers are: "+ avg);
    }
 }