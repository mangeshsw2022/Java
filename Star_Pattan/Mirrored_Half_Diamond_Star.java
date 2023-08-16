import java.util.Scanner;

public class Mirrored_Half_Diamond_Star 
{
    public static void main(String args[])
    {
        int i,j,num;

        Scanner star = new Scanner(System.in);
        
        System.out.print("enter row size :");
        num = star.nextInt();

        //upper part
        for(i=0;i<num;i++)
        {
            for(j=0;j<num-i;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();//for the next line
            
        }

        //lowwer part
        for(i=0;i<num;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<num-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();//for the next line
            
        }
        
    }    
}
