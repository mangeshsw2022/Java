import java.util.Scanner;

class Square_Star
{
    public static void main(String[] args) 
    {
        Scanner star = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of rows: "); //Taking input from user
        num = star.nextInt();
        int i,j;    //row , coloum;
        for(i=0;i<num;i++)
        {
            for(j=0;j<num;j++)
            {
                System.out.print("*");//for printing star's

            }
            System.out.println();//for next line 
        }
    }
}