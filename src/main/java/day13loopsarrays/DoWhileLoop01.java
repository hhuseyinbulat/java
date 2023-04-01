package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        // Example 1: Kullanıcıdan bir sayı alınız, sayı 100 den küçük ise ekrana "Kazandın!" yazdırınız aksi halde ekrana
        // "Kaybettin!" yazmalısınız kullanıcı kazandıkça oyun devam etmeli

        Scanner input = new Scanner(System.in);
//        int sayi = 0;
//
//        do {
//            System.out.println("Bir sayı giriniz");
//        sayi = input.nextInt();
//
//        if (sayi<100){
//            System.out.println("Kazandınız");
//        }
//        }while (sayi<100);
//        System.out.println("Kaybettiniz");

        // Example 2 :Kullanıcıdan ismini alınız ilk harfinin büyük harf olup olmadıgını kontrol ediniz;


        do {
            System.out.println("Lütfen adınızı giriniz");
            char ilkHarf = input.next().charAt(0);
            if (ilkHarf>='A'&& ilkHarf<='Z'){
                System.out.println("İsmi başarıyla girdiniz");
            }else System.out.println("İsmi başarıyla girmediğiniz için işleminiz sonlandırılmıştır"); break;

        }while (true);

        //Infinite loop : Sonsuz döngü
        // Artırma Azaltma kısmında hata yaparsanız Infinite loop sorunsalı oluşur
        // Artırma Azaltma kısmını yazmazsanız Infinite loop sorunsalı oluşur









    }
}
