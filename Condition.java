import java.util.*;
class Condition {
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        
        if(a%2==0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}