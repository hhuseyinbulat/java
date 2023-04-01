package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        // Example 1:Kullanıcıdan aldıgınız isimin ilk ve son harfini yazdırınız
        // 1. Yol
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String name = input.next();

        char ilkHarf = name.charAt(0);
        char sonHarf = name.charAt(name.length()-1);
        System.out.println(""+ilkHarf+sonHarf);

        //2.yol
        String ilkHarf1 = name.substring(0,1);
        String sonHarf1 = name.substring(name.length()-1);
        System.out.println(ilkHarf1+sonHarf1);

        //Example 2: Aşağıda verilen stringteki sadece hayvan isimlerini yazdırınız:
        //"ben kedi esim tavuk oğlum inek sever"

        String str = "ben kedi, esim tavuk, oğlum sever inek";
        // substring() in iki kullanımı vardır
        // i) substring(baslangıc indeksi, bitis indeksi) String in ortasından bir parça almaya yarar
        //ii) substring(baslangıc indeksi) String ten verilen indeksten sonuna kadar almaya yarar

        String kedi = str.substring(4,8);
        String tavuk = str.substring(15,20);
        String inek = str.substring(34);
        System.out.println(kedi+tavuk+inek);

        //Example 3: İlk isim ve soy isimi içeren isimlerden ilk ve soy isimlerin baş harflerini yazdırınız?
        System.out.println("ilk ve soy isinizi giriniz");
        String tamIsim = input.nextLine();
        String a = tamIsim.substring(0,1);
        String b = tamIsim.split(" ")[1].substring(0,1);
        System.out.println(a+b);









    }
}
