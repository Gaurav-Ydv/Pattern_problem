package Pattern;

import java.util.Scanner;

public class CharacterRepeated_Pattern {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
//        int c = sc.nextInt();


        //This loop will print left Character Triangle
//        for (int i = 1; i <= r; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch);
//                ch++;
//
//            }
//            System.out.println();
//
//        }


        //This loop will print reverse left Character Triangle
//        for (int i = r; i >= 1 ; i--) {
//            char ch = 'A';
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch + " ");
//                ch++;
//
//            }
//            System.out.println();
//
//        }


        //This loop will print right Character Triangle
//        for (int i = 1; i <= r ; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= r-i ; j++) {
//                System.out.print(" ");
//
//            }
//            for (int k = 1; k <= i ; k++) {
//                System.out.print(ch);
//                ch++;
//
//            }
//            System.out.println( );
//
//        }


        //This loop will print reverse right character Triangle
//        for (int i = r; i >= 1 ; i--) {
//            char ch = 'A';
//            for (int j = 1; j <= r-i ; j++) {
//                System.out.print(" ");
//
//            }
//            for (int k = 1; k <= i ; k++) {
//                System.out.print(ch);
//                ch++;
//
//            }
//            System.out.println();
//
//
//        }


          //This loop will print character Triangle
//        for (int i = 1; i <= r ; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= r-i ; j++) {
//                System.out.print(" ");
//
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch + " ");
//                ch++;
//
//            }
//            System.out.println();
//
//        }

        //This loop will print the reverse Character Triangle
//        for (int i = r; i >=1 ; i--) {
//            char ch = 'A';
//            for (int j = 1; j <= r-i ; j++) {
//                System.out.print(" ");
//
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(ch + " ");
//                ch++;
//
//            }
//            System.out.println();
//
//        }


        //This whole loop print Left Diamond Alphabet pattern
//        for (int i = r; i >= 1 ; i--) {
//            char ch = 'A';
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch+" ");
//                ch++;
//
//            }
//            System.out.println();
//
//        }
//        for (int i = 2; i <= r ; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch+" ");
//                ch++;
//
//            }
//            System.out.println();
//
//        }


        //This hole Loop print Right Diamond Alphabet Pattern
//        for (int i = r; i >=1 ; i--) {
//            char ch = 'A';
//            for (int j = 1; j <= r-i ; j++) {
//                System.out.print(" ");
//
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch );
//                ch++;
//
//            }
//            System.out.println( );
//
//        }
//        for (int i = 2; i <= r ; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= r-i ; j++) {
//                System.out.print(" ");
//
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch );
//                ch++;
//
//            }
//            System.out.println( );
//
//        }


        // This is  Diamond Alphabet Pyramid with Center Alignment
//         A
//        A B
//       A B C
//      A B C D
//     A B C D E
//      A B C D
//       A B C
//        A B
//         A
//        for (int i = 1; i <= r ; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= r-i ; j++) {
//                System.out.print(" ");
//
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch + " ");
//                ch++;

//            }
//            System.out.println();
//
//        }
//        for (int i = r-1; i >= 1 ; i--) {
//            char ch = 'A';
//            for (int j = 1; j <= r-i ; j++) {
//                System.out.print(" ");

//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch + " ");
//                ch++;
//
//            }
//            System.out.println( );
//
//        }


        //This is Symmetrical Alphabet Triangle or Pyramid Trapezium Alphabet Pattern
//                A
//                AB
//                ABC
//                ABCD
//                ABC
//                AB
//                A
//        for (int i = 1; i <= r ; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch);
//                ch++;
//
//            }
//            System.out.println();
//
//        }
//        for (int i = r-1; i >= 1 ; i--) {
//            char ch = 'A';
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//
//        }


        // This is Diamond Alphabet Half Pyramid or Symmetrical Alphabet Diamond.
//                 A
//                AB
//               ABC
//              ABCD
//             ABCDE
//              ABCD
//               ABC
//                AB
//                 A
//        for (int i = 1; i <= r ; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= r-i ; j++) {
//                System.out.print(" ");
//
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch);
//                ch++;
//
//            }
//            System.out.println( );
//
//        }
//        for (int i = r-1 ; i >= 1 ; i--) {
//            char ch = 'A';
//            for (int j = 1; j <= r-i ; j++) {
//                System.out.print(" ");
//
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch);
//                ch++;
//
//            }
//            System.out.println( );
//
//        }



        /*This is Pyramid of Repeated Alphabets or Centered Alphabet Pyramid Pattern
            A
           B B
          C C C
         D D D D
        E E E E E */
//        char ch = 'A';
//        for (int i = 1; i <= r ; i++) {
//
//            for (int j = 1; j <= r - i; j++) {
//                System.out.print(" ");
//
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(ch + " ");
//
//            }
//            ch++;
//            System.out.println();
//
//        }


//-------//Triangle Pattern of Odd Numbers-----------------------------------
//        int odd = 1;
//        for (int i = 1; i <= r ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                    System.out.print(odd+" ");
//                    odd += 2;
//            }
//            System.out.println();
//
//        }

//-------Triangle Pattern of even Numbers-----------------------------------
//        int even = 2;
//        for (int i = r; i >= 1; i--) {
//            for (int j = 1; j <= r - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(even+" " );
//                even += 2;
//            }
//            System.out.println();
//        }



//--------//odd triangle-------------
//        int odd = 2;
//        for (int i = 1; i <= r ; i++) {
//            int odd = 1;
//            for (int j = 1; j <=i ; j++) {
//                    System.out.print(odd+" ");
//                    odd += 2;
//            }
//            System.out.println();
//
//        }

//---------------------------------------------------
//        for (int i = 1; i <= r ; i++) {
//            char ch = 'A';
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(ch+" ");
//                ch++;
//
//            }
//            System.out.println();
//
//        }

//-----print these pattern----------------------
   /* 1
      A B
      1 2 3
      A B C D
      1 2 3 4 5 */
//        for (int i = 1; i <= r ; i++) {
//            if (i % 2 == 1){
//                for (int j = 1; j <= i ; j++) {
//                    System.out.print(j+" ");
//                }
//            }
//            else{
//                char ch = 'A';
//                for (int j = 1; j <= i ; j++) {
//                    System.out.print(ch+" ");
//                    ch++;
//                }
//            }
//            System.out.println();
//        }


//-----------------------------------------------------------------------------------------------------
////    *
//      *
//      *
//* * * * * * *
//      *
//      *
//      *
//        for (int i = 1; i <= r ; i++) {
//            if(i == 4){
//                for (int j = 1; j <= r; j++) {
//                    System.out.print("* ");
//
//                }
//                System.out.println();
//            }
//            else{
//                System.out.println("      *");
//            }
//
//        }


//--------------------------------------------------------------------------------------------------
//    *
//    *
//* * * * *
//    *
//    *
//        for (int i = 1; i <= r ; i++) {
//            if( i == 3){
//                for (int j = 1; j <=r ; j++) {
//                    System.out.print("* ");
//
//                }
//                System.out.println();
//            }
//            else{
//                    System.out.println("    *");
//            }
//        }

        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= r ; j++) {
                if( i == j)
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}
