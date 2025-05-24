import java.util.*;
public class decTobin{
    public static int decToBin(int decNum){
        int pow=0;
        int binNum = 0;
        while(decNum>0){
            int remainder = decNum%2;
            binNum = binNum+ remainder*(int)Math.pow(10, pow);
            decNum = decNum/2;
            pow++;
        }
        return binNum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int deciNum = sc.nextInt();
        int binNum = decToBin(deciNum);
        System.out.println("Binary number of " + deciNum + " = " + binNum);
    }
}