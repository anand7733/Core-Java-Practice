//Take three numbers from the user and print the greatest number.//


import java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
            Scanner ob = new Scanner(System.in);

            System.out.print("Input the 1st number: ");
            int a = ob.nextInt();

            System.out.print("Input the 2nd number: ");
            int b = ob.nextInt();

            System.out.print("Input the 3rd number: ");
            int c = ob.nextInt();


            if (a > b)//a is Greater than b check condition true otherwise next line
                if (a > c)//a is Greater than c check condition true otherwise next line
                    System.out.println("The greatest: " + a);//both wrong next condition check

            if (b > a)
                if (b > c)
                    System.out.println("The greatest: " + b);

            if (c > a)
                if (c > b)
                    System.out.println("The greatest: " + c);
        }
    }


