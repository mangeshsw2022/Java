import java.util.Scanner;

class Hollow_Mirrored_Rhombus_Star{
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of rows: "); // Taking input from user
        num = star.nextInt();
        int i, j; // row , coloum;
        int n = num - 1;
        for (i = 0; i < num; i++) {
            for (j = 0; j <= i; j++)// this is logic
            {
                System.out.print(" ");

            }
            for (j = 0; j < num; j++) {
                if (i == 0 || i == n || j == 0 || j == n) {
                    System.out.print("*");// for printing star's
                } else {
                    System.out.print(" ");// for spaces
                }

            }
            System.out.println();// for next line
        }
    }
}