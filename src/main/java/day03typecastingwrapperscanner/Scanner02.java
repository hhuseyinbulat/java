package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
      // Example 1: Sayıları kullanıcıdan alan ve toplama işlemi yapan kodu yazınız
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk sayıyı giriniz...");
        double sayi1 = input.nextDouble();
        System.out.println("Ikıncı sayıyı giriniz");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1+sayi2);
    }


}
