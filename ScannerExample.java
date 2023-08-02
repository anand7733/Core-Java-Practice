import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a value: ");
        String input = scanner.nextLine();
        
        System.out.println("You entered: " + input);
        
        scanner.close();
    }
}
