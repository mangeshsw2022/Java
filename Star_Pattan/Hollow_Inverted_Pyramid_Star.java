import java.util.Scanner;

public class Hollow_Inverted_Pyramid_Star {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of rows: "); // Taking input from user
        num = star.nextInt();
        int i, j; // row , coloum;
        int n = num - 1;

        for (i = 0; i <= num; i++) {
            for (j = 0; j <= i; j++)// this is logic
            {
                System.out.print(" ");
            }
            for (j = 0; j <= num - i; j++)// this is logic
            {
                if (j == 0 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (j = 1; j <= num - i; j++)// this is logic
            {
                if (i == 0||j==num-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();// for next line
        }
    }
}
