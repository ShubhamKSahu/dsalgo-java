import java.util.*;

public class printMsg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String message = greet(name);
        System.out.println(message);
    }
    static String greet(String name){
        String msg = "Hi " + name;
        return msg;
    }
}
