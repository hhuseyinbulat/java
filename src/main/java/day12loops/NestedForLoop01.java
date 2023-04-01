package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        //Example 1 : Aşağıdaki şekli ekrana yazdıran kodu yazınız
        // ****
        // ****
        // ****

//        for (int i= 1; i<4; i++){
//            for (int k= 1; k<5;k++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        Scanner input =new Scanner(System.in);
//        System.out.println("satır sayısını giriniz");
//        int satir = input.nextInt();
//        System.out.println("sutun sayısını giriniz");
//        int sutun = input.nextInt();
//        System.out.println(" Karakter giriniz");
//        char c = input.next().charAt(0);
//
//        for (int i= 1; i<=satir; i++){
//            for (int k= 1; sutun<=5;k++ ){
//                System.out.print(c);
//            }
//            System.out.println();
//        }
        /* Example 2 : Aşağıdaki şekli çizen kodu yazınız
        1
        12
        123
        1234
        12345
       */
        for (int i = 1; i<6; i++){
            for (int k =1;k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

        //Example 3: Aşağıdaki şekli çizen kodu yazınız
        /*

        ****
        ***
        **
        *
                */
        int row = 4;

        for (int i=1 ; i<=row;i++){
            for (int k = row; k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }









    }
}
