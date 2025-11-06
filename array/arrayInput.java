import java.util.*;
public class arrayInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
       System.out.println("Physics mark: "+ marks[0]);
       System.out.println("Chemistry mark: "+ marks[1]);
       System.out.println("Maths mark: "+ marks[2]);
       marks[2] = 100;
       System.out.println("Updated Maths marks: "+ marks[2]);
       marks[2] = marks[2]+ 1;
       System.out.println("Updated Maths marks: "+ marks[2]);
    }
}
