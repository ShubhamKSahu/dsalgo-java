import java.util.*;
public class binomialCoeff {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int binomialCoff(int n, int r){
        int factn = factorial(n);
        int factr = factorial(r);
        int factnmr = factorial(n-r);
        int bc = factn/(factr * factnmr);
        return bc;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();
        int bc =binomialCoff(n, r);
        System.out.println("Binomial Coefficient is: "+ bc);
        sc.close();
    }
}
