import java.util.Scanner;

public class Mirrored_Right_Tringle_Star 
{
    public static void main(String args[])
    {
        int i,j,num;

        Scanner star = new Scanner(System.in);
        
        System.out.print("enter row size :");
        num = star.nextInt();
        
        for(i=0;i<num;i++)
        {
            for (j = 0; j <= num - i; j++)// this is logic
            {
                System.out.print(" ");                
            }     
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();//for the next line
            
        }
        
    }   
}
