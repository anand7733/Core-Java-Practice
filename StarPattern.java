public class StarPattern {
    public void main(String[]args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.println("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for(int j=3;j>=i;j--)
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }
    
}
