package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        // Example: Kulannıcıdan bir dikdörtgenin en ve boyunu alan ve alan ve çevresini hesaplayan bir kod yazınız

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin Kısa Kenar Uzunluğunu Giriniz");
        double kısaKenar = input.nextDouble();

        System.out.println("Dikdörtgenin Uzun Kenar Uzunluğunu Giriniz");
        double uzunKenar = input.nextDouble();

        System.out.println("Dikdörtgenin Alanı: "+ kısaKenar*uzunKenar);
        System.out.println("Dikdörtgenin Çevresi: "+ (kısaKenar+uzunKenar)*2);



    }
}
