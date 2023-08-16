import java.util.Scanner;

class Hollow_Squre_Star 
{
    public static void main(String[] args) 
    {
        Scanner star = new Scanner(System.in);
        int num;
        
        System.out.print("Enter the number of rows: "); //Taking input from user
        num = star.nextInt();
        int n= num+1; // for adjusting tringle
        int i,j;    //row , coloum;
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=num;j++)
            {
                if(i==num||i==1||j==num||j==1)
                {
                    System.out.print("*");//for printing star
                }
                else
                {
                    System.out.print(" ");//for space
                }
            }
            System.out.println();//for next line 
        }
    }    
}
