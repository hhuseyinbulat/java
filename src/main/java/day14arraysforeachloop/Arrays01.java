package day14arraysforeachloop;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    //Arrays'lerin içine sadece primitive data tipleri ve referance lar yerleştirilebilir
    public static void main(String[] args) {
        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";

        //String bir array olusuturunuz ve "Tom" ve "Tom"dan önceki bütün elemanları ekrana yazdırınız

        String names[] = {"Jane", "Mark", "Cristopher", "Tom", "Ali", "Rojda"};


        for (String w : names) {
            System.out.print(w + " ");
            if (w.equals("Tom")) {
                break;
            }
        }
        System.out.println();

        //String bir array oluşturun "Tom" ve "Jane" hariç tüm elemanları yazdırınız

        for (String w : names) {

            if (w.equals("Tom") || w.equals("Jane")) {
                continue;
            }
            System.out.print(w + " ");

        }
        System.out.println();

        //example 3) Bir öğretmenin sınıfındaki öğrencilerinin isimlerini app a yüklemesini sağlayan kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç öğrenci ismi gireceksiniz");

        int numOfStd = input.nextInt();
        String namess[] = new String[numOfStd];
        System.out.println("Girişi sonlandırmak için Q harfine basınız ");

        for (int i = 1; i <= numOfStd; i++) {
            System.out.println("Lütfen " + i + ".öğrenci ismini giriniz");

            String stdname = input.next();
            if (stdname.equalsIgnoreCase("Q")) {
                break;
            }
            namess[i - 1] = stdname;
        }
        System.out.println(Arrays.toString(namess));








    }
}












