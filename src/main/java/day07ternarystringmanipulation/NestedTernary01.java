package day07ternarystringmanipulation;

import com.sun.security.jgss.GSSUtil;

public class NestedTernary01 {
    public static void main(String[] args) {

        /* Verilen yılın Leap Year olup olmadığını kontrol ede kodu yazınız
         Leap Year kuralı:
         i) 100 e bölünüyorsa 400 e de bölünmeli
         ii) 100 e bölünmüyorsa 4 e bölünmeli
         */

        int year = 2001;
    String leap = year%100 == 0 ? (year %400 == 0 ? "Leap year": "Leap Year değil") : (year%4 ==0 ? "Leap year": "Leap Year değil" );
        System.out.println(leap);


        // aşağıdaki kurallara göre passwordün geçerli olup olmadınıgını kontrol eden kodu yazınız
        //i) 8 karakterden fazla ise ilk harfi i olmalıdır
        //ii) 8 karakterden az ise ilk harfi K olmalıdır

        String pwd = "K2a3";
        int krktrno = pwd.length();
        char ilkHarf = pwd.charAt(0);

       String sonuc4 = krktrno<8 ? (ilkHarf == 'K'? "Geçerli": "Geçersiz") : (ilkHarf=='i'? "Geçerli" : "Geçersiz");
        System.out.println(sonuc4);





    }
   }
