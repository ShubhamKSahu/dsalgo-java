import java.util.*;
public class sumOfTwo{
    // public static void main(String[] args) {
    //     int ans = sum();
    //     System.out.print(ans);
    // }
    // static int sum(){
    //     Scanner sc = new Scanner(System.in);
    //     int num1 = sc.nextInt();
    //     int num2 = sc.nextInt();
    //     int sum = num1+num2;
    //     return sum;
    // }

    public static void main(String[] args) {
        int ans = sum(10, 15);
        System.out.println(ans);
    }
    static int sum(int num1, int num2){
        return num1+num2;
    }
}