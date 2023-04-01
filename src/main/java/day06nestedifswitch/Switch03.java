package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        // Kullanıcıdan işlem ve iki tane sayı alarak işlemin sonucunu ekrana yazdıran basit bir hesap makinesi yapınız

        Scanner input = new Scanner(System.in);
        System.out.println("işlemi giriniz +, -, *, / ve %");
        char islem = input.next().charAt(0);

        System.out.println("ilk sayıyı giriniz");
        double s1 = input.nextDouble();
        System.out.println("ikinci sayıyı giriniz");
        double s2 = input.nextDouble();
        switch (islem){
            case '+':
                System.out.println(s1+s2);
                break;
            case '-':
                System.out.println(s1-s2);
                break;
                case '*':
                System.out.println(s1*s2);
                break;
                case '/':
                System.out.println(s1/s2);
                break;
                case '%':
                System.out.println(s1*s2/100);
                break;
            default:
                System.out.println(" lütfen belirtilen işlemlerden birisini giriniz");
        }

        // Switch sadece byte short int char ve String data tipleri kullanılabilir
        // üçden fazla durum varsa switch







    }
}
