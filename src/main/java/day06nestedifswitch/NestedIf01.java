package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
        Password'un ilk harfi buyuk harf ise
    'A' olursa gecerli password aksi halde gecersiz password
Password'un ilk harfi kucuk harf ise
    'z' olursa gecerli password aksi halde gecersiz password
        */

        String pwd = "zxy45";
        char ilkHarf = pwd.charAt(0);


        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
            if( ilkHarf == 'A') {
                System.out.println("Geçerli");}
            else {
                System.out.println("Geçersiz");
            }}
        else if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            if (ilkHarf == 'z') {
                System.out.println("Geçerli");}
            else {System.out.println("geçersiz");

            }}
        else {
            System.out.println(" ilk karakter harf olmalıdır");
        }
        /*
        Note: Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
      Bu yuzden mumkunse "nested" kod yazmamaya calisiriz.



         */


    }
    }
