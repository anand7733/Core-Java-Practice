public class Incrementvalue2 {
    public static void main(String[]args){
        int num=10;
        for(int i=1;i<=num;i+=2){
            System.out.println(i+" ");
        }
    }
}
//i=1       i<=num  print(i)    i+=2
//i=1       1<=num  1           1+2=3
//i=3       3<=num  3           3+2=5
//i=5       5<=num  5           5+2=7
//i=7       7<=num  7           7+2=9
//i=9       9<=num  9           9+2=11
//i=11      11<=num errror      end loop