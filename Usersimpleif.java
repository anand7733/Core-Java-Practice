import java.util.*;

class Usersimpleif {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        if (a > b) {
            System.out.println("a is great");
        }
        if (a < b) {
            System.out.println("a is less");
        }
        if (a <= b) {
            System.out.println("a is less equal");
        }
        if (a >= b) {
            System.out.println("a is great equal");
        }
        if (a == b) {
            System.out.println("a eqaual to b");
        }
        if (a != b) {
            System.out.println("a not equal to b");
        } else {
            System.out.println("relational operator");
        }

    }
}