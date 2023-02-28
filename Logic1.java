class Logic1{  
    public static void main(String args[]){  
    int a=10;  
    int b=5;  
    int c=20;  
    System.out.println(a<b&&a++<c);// 10 lessthan 5 =false  && 10 lessthan 20 =true --false
    System.out.println(a);  //10
    System.out.println(a<b&a++<c); // 10 lessthan 5 =false  && 10 lessthan 20 =true --false 
    System.out.println(a);//11
    }
}  