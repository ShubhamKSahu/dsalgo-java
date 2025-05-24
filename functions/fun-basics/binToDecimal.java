import java.util.*;
public class binToDecimal{
    public static int binToDeci(int binNum){
        int deciNum = 0;
        int pow = 0;
       while(binNum > 0){
        int ld = binNum%10;
        deciNum = (int)(deciNum + ld*Math.pow(2, pow));
        binNum = binNum/10;
        pow++;
       }
       return deciNum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int binNum = sc.nextInt();
        int deciNum = binToDeci(binNum);
        System.out.println("decimal of " + binNum + " is "+ deciNum);
    }
}