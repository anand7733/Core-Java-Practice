import java.net.SocketPermission;

public class SimpleIf {
    public static void main(String[] args) {
        int marks = 45;
        if (marks < 40) {
            marks = marks + 5;
            System.out.println("Fail and hard work");
        }
        System.out.print(marks);

    }
}