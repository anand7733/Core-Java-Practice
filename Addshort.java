public class Addshort{  
    public static void main(String args[]){  
    short a=10;  
    short b=10;  
    //a=a+b; Compile time error  10+10=20 now int 
    a=(short)(a+b);//20 which is   int now converted to short   
    System.out.println(a);  
    }
}  