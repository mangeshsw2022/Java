//   *****     *****
//  *******   *******
// ********* *********
// *****Codeforwin****
//  *****************
//   ***************
//    *************
//     ***********
//      *********
//       *******
//        *****
//         ***
//          *
// Heart Star Pattern with Name

import java.util.Scanner;

class Heart_Star_with_Name 
{
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of rows: "); // Taking input from user
        num = star.nextInt();
        int i, j; // row , coloum;
        int n = num - 1;

        int num1=num/2;

        n = num;
        
        for (i = 0; i <= num1; i++) 
        {   
            //Upper Part left
            for (j = 0; j <= num1 - i; j++)// this is logic
            {
                System.out.print(" ");                
            }
            for (j = 0; j <=i*2; j++)// this is logic
            {
                System.out.print("*");                
            }
            
            // //Middle space inverted tringle
            // for (j = 0; j <=i; j++)// this is logic 
            // {
            //     System.out.print(" ");                
            // }
            // for (j = 0; j<=num1-i; j++)// this is logic
            // {
            //     System.out.print(" ");                
            // }
            // for (j = 1; j<=num1-i; j++)// this is logic
            // {
            //     System.out.print(" ");                
            // }
            

            //Upper Part left
            // System.out.print("S");
            for (j = 1; j <= num1 - i; j++)// this is logic
            {
                System.out.print(" ");                
            }
            for (j = 1; j <= num1 - i; j++)// this is logic
            {
                System.out.print(" ");                
            }
            for (j = 0; j <=i*2; j++)// this is logic
            {
                System.out.print("*");                
            }
            System.out.println();// for next line
        }

        
        //Lowwer Part
        for (i = 1; i <= num; i++) 
        {
            for (j = 0; j <=i; j++)// this is logic 
            {
                System.out.print(" ");                
            }
            for (j = 0; j<=num-i; j++)// this is logic
            {
                System.out.print("*");                
            }
            for (j = 0; j<=num-i; j++)// this is logic
            {
                    System.out.print("*");
               
            }
            System.out.println();// for next line
        }
    }
}
