import java.util.Scanner;

class Rhombus_Star
{
    public static void main(String[] args) 
    {
        Scanner star = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of rows: "); //Taking input from user
        num = star.nextInt();
        int i,j;    //row , coloum;
        int n= num-1;
        for(i=0;i<num;i++)
        {
            for(j=0;j<=n-i;j++)//this is logic 
            {
                System.out.print(" ");
                // if(j==0||i==0||i==n-j)
                // {
                    
                // }
                // else{
                //     System.out.print(" ");
                // }

            }
            for(j=0;j<num;j++)
            {
                System.out.print("*");//for printing star's

            }
            System.out.println();//for next line 
        }
    }
}