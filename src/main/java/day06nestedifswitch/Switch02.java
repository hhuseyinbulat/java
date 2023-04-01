package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        // Kullanıcıya ay ismi sorunuz ve kullanıcının verdiği ay isminden son aya kadar ekrana yazdırınız
        //tolowercase methodu bir stringteki bütün karakterleri küçük harfe çevirir
        //touppercase methodu bir stringteki bütün karakterleri büyük harfe çevirir

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ay ismi giriniz");
        String ayIsmı = input.next().toLowerCase(); // ay ismini aldık ve küçük harfe cevirdik

        switch (ayIsmı){
            case "ocak" :
                System.out.println("ocak");
            case "şubat" :
                System.out.println("şubat");
            case "mart" :
                System.out.println("mart");
            case "nisan" :
                System.out.println("nisan");
            case "mayıs" :
                System.out.println("mayıs");
            case "haziran" :
                System.out.println("haziran");
            case "temmuz" :
                System.out.println("temmuz");
            case "ağustos" :
                System.out.println("ağustos");
            case "eylül" :
                System.out.println("eylül");
            case "ekim" :
                System.out.println("ekim");
            case "kasım" :
                System.out.println("kasım");
            case "aralık" :
                System.out.println("aralık");
                break;
            default:
                System.out.println(" geçerli ay ismi giriniz");
        }



    }
}
