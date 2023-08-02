import java.util.*;

public class Greator {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        if (a > b) {
            System.out.println("a big");
        } else if (a < b) {
            System.out.println("b big");
        } else {
            System.out.println("equal");
        }
    }
}