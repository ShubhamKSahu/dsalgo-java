import java.util.*;
public class productOfTwo {
    public static int productOfTwo(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        int a=5;
        int b = 4;
        int product = productOfTwo(a, b);
        System.out.println("Product of "+ a + " and " + b + "=" + product);
    }
}
