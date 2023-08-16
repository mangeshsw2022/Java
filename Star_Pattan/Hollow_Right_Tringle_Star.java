import java.util.Scanner;

class Hollow_Right_Tringle_Star 
{
    public static void main(String args[])
    {
        int i,j,num;

        Scanner star = new Scanner(System.in);
        
        System.out.print("enter row size :");
        num = star.nextInt();
        int n = num-1;

        for(i=0;i<=num;i++)
        {
            for(j=0;j<=i;j++)
            {
                if(j==0||i==num||j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();//for the next line
            
        }
        
    }
}
