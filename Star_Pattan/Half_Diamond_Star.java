import java.util.Scanner;

class Half_Diamond_Star 
{
        public static void main(String args[])
    {
        int i,j,num;

        Scanner star = new Scanner(System.in);
        
        System.out.print("enter row size :");
        num = star.nextInt();

        for(i=0;i<num;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();//for the next line
            
        }
        for(i=0;i<num;i++)
        {
            for(j=0;j<num-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();//for the next line
            
        }
        
    }
}
