package Pattern;

import java.util.Scanner;

public class ReverseRightTriangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int r = sc.nextInt();

        for (int i = r; i >= 1 ; i--) {
//            for (int j = 1; j <= i  ; j++) {   //from this loop it print the left reverse right Angle Triangle
//                System.out.print("*");
//
//            }
            for (int k = 1; k <= r-i ; k++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i  ; j++) {  // this loop print right reverse_right angle Triangle
                System.out.print(j);

            }
            System.out.println( );

        }
        for (int i = 2; i <= r ; i++) {
            for (int j = 1; j <= r-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }
}
