import java.util.*;
public class checkPalindrome{
    public static void chkPalindrome(int num){
        int revNum = 0;
        int originalNum = num;
        while(num>0){
            int lastDigit = num%10;
            revNum = revNum*10 + lastDigit;
            num = num/10;
        }
        if(originalNum == revNum){
            System.out.println(originalNum + " is a palindrome number");
        } else {
            System.out.println(originalNum + " is not a palindrome number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        chkPalindrome(num);
    }
}
