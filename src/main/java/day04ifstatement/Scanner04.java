package day04ifstatement;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        // Example 1 : Kulaanıcıdan İlk Orta ve Soy ismini ayrıca kimlik nosunu alınız ve aşağıdaki formatta yazdırınız
        // Ali Mert Can
        // 123456789

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen ilk isminizi giriniz");
        String ilkIsım = input.next();

        //next() methodu kullanıcıdan String datası almak için kullanılır

        System.out.println("Lütfen orta isminizi giriniz");
        String ortaIsim = input.next();

        System.out.println("Lütfen soy isminizi giriniz");
        String soyIsim = input.next();

        System.out.println("Lütfen kimlik numaranızı giriniz");
        String kimlikNo = input.next();


        System.out.println(ilkIsım + " " + ortaIsim + " " + soyIsim);
        System.out.println(kimlikNo);

        // 2. yol:

        System.out.println("İlk, orta ve soy isminizi ve kimlik numaranızı giriniz");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);

        //3. yol:

        System.out.println("İlk orta ve soyadınızı giriniz");
        String tamIsim = input.nextLine();

        System.out.println("Lütfen kimlik nosunu giriniz");
        String kimlikNo1 = input.next();

        System.out.println(tamIsim);
        System.out.println(kimlikNo1);


    }
}
