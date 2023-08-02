//Write a Java program to get a number from the user and print whether it is positive or negative.//

import java.util.Scanner;
public class Positive {
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int a =ob.nextInt();
        if (a>0){
            System.out.println("Positive");
        } else if (a<0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
