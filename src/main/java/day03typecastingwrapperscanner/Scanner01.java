package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    /*
    Scanner kullanıcıdan data almaya yarar.
    Scanner kullanıcı ile etkileşim kurmamızı sağlar.
    Scanner bir java Class'ıdır.
    bu class'ı kullanabilmek için import etmek gerekir
    scanner classı javanın util kütüphanesindedir
    Scanner Classının içinde kullanıcıdan veri almamıza yarayan methodlar vardır


     */

    public static void main(String[] args) {

        // kullanıcıdan data almak için yapılması gerekenler
        // 1.Adım: scanner classından object oluşturun

        Scanner input = new Scanner(System.in);

        //2.Adım: Kullanıcıya ne yapacağını söyle
        System.out.println("Hey kullanıcı yaşını gir...");

        // 3. Adım: Kullanıcıdan aldığınız datayı bir variablee ın içine koyun

        byte age = input.nextByte();

        System.out.println("Hey Kullanıcı senin  yaşın:"+age);




    }
}
