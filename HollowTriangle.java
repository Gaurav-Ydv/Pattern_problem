package Pattern;

import java.util.Scanner;

public class HollowTriangle{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int r = sc.nextInt();
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= r-i ; j++) {
                System.out.print(" ");
                if(i == 1 || i ==r )
                    System.out.print(j);
            }
            for (int k = 1; k <= i ; k++) {

            }


        }
    }
}
