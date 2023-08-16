import java.util.Scanner;

class Hollow_Inverted_Right_Tringle_Star 
{
        public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of rows: "); // Taking input from user
        num = star.nextInt();
        int i, j; // row , coloum;
        int n = num - 1;
        for (i = 0; i <= num; i++) {
            for (j = 0; j <= num - i; j++)// this is logic
            {
                if(i==0||j==0||j==num-i)//this logic for hollow
                {
                    System.out.print("*");

                }                
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();// for next line
        }
    }
}
