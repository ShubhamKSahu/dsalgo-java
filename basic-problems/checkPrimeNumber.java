import java.util.*;

public class checkPrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        if(n<=1){
            System.out.println(n+ " is not a prime number");
            return;
        }
        for(int i=2; i*i <= n; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n+ " is a prime number");
        } else{
            System.out.println(n+ " is not a prime number");
        }
        sc.close();
    }
}
