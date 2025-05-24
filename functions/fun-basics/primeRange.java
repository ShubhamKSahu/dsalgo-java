import java.util.*;
public class primeRange{
    public static void checkPrime(int range){
        for(int num=2; num<=range; num++){
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                } 
            }
             if(isPrime){
                System.out.println(num);
            }  
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of range :");
        int range = sc.nextInt();
        System.out.println("Prime numbers between 2 to " + range + " are: ");
        checkPrime(range);
        sc.close();
    }
}