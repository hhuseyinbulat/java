package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        //Example 3 ten 10 a kadar tam sayıları aynı satırda ekrana yazdıran kodu yazınız
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 2. yol:

        int i = 3;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //Example 2: 17 den 4 e kadar tüm çift sayıları ekrana aynı satırda yazdıran kodu yazınız

        int a = 17;
        while (a > 3) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            a--;

        }
        System.out.println();

        // Example 3: 12 de 67 ye kadar olan sayıların toplamını veren kodu yazınız

        int b = 12;
        int sum = 0;
        while (b < 68) {
            sum = sum + b;
            b++;
        }
        System.out.println(sum);



        // Example 4: size verilen bir tam sayının rakamları toplamını ekrana yazdıran kodu yazınız
        int c = 654378;
        int sum1 = 0;

        while (c>0){
           sum1=sum1 +c%10;

           c=c/10;
        }
        System.out.println(sum1);

        // Example 5: kullanıcıdan aldıgınız bir sayının çarpım tablasonu ekrana yazdırınız

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int v = input.nextInt();
        int k = 1;
        while (k<11){
            System.out.print( v +"*"+ k+ "=" +v*k+"  ");
            k++;
        }







    }
}
