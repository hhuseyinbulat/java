package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        /*
        Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
        Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
        i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
        ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.

         */
        //Example 1: Kullanıcıdan gün isimlerini alınız, o günün hafta sonu mu hafta içi mi oldugunu kullanıcıya söyleyiniz

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz...");
        String gun = input.next();

        // 1. Yol:

        if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Salı")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Çarşamba")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Perşembe")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else {
            System.out.println("Geçerli bir gün ismi giriniz...");
        }

        // 2. Yol:
        if (gun.equalsIgnoreCase("Pazar") ||
                gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else if
        (gun.equalsIgnoreCase("Pazartesi") ||
                        gun.equalsIgnoreCase("Sali") ||
                        gun.equalsIgnoreCase("Carsamba") ||
                        gun.equalsIgnoreCase("Persembe") ||
                        gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

        // 3. Yol:
        boolean haftaSonu = gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");

        boolean haftaIci =
                        gun.equalsIgnoreCase("Pazartesi") ||
                        gun.equalsIgnoreCase("Sali") ||
                        gun.equalsIgnoreCase("Carsamba") ||
                        gun.equalsIgnoreCase("Persembe") ||
                        gun.equalsIgnoreCase("Cuma");

        if (haftaSonu) {
            System.out.println(" HAFTASONU");}
        else if (haftaIci) {
            System.out.println("HAFTAİÇİ");}
        else {
            System.out.println("LÜTFEN GEÇERLİ BİR GÜN İSMİ GİRİNİZ");


        }

    }
}





