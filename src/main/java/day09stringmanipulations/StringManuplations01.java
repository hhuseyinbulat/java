package day09stringmanipulations;

import java.util.Scanner;

public class StringManuplations01 {
    public static void main(String[] args) {
        String str = "Kara kara düsünme Ankara";
        int idxA = str.indexOf("kara");
        System.out.println(idxA);
        // indexOf() methodu verilen karakter veya karakterlerin ilk görünümünün indeksini verir.
        String m = "Hello everyone!";
        int e = m.lastIndexOf("e",7);
        System.out.println(e);


        int idxA2 = str.lastIndexOf("kara");
        System.out.println(idxA2);
        // LastIndexOf() methodu verilen karakter veya karakterlerin son görünümünün indeksini verir.

        String s = "Mississipi";
        int idxI = s.indexOf('i');
        System.out.println(idxI);
        //indexOf() methodu hem char hem de stringle  kullanılır.

        int idxS = s.indexOf("iss");// 'İlk' görünümün ilk karakterinin indeksini verir
        System.out.println(idxS);

        int idxS2 = s.lastIndexOf("iss");// 'Son' görünümün ilk karakterinin indeksini verir
        System.out.println(idxS2);

        // Example 1 : Bir Stringteki bir karakterin tekrarlı veya tekrarsız olup olmadıgını gösteren kodu yazınız.
        // string "Helloooooo"
        String t = "Helloooooo";
        char c = 'o';
        if(t.indexOf(c) == t.lastIndexOf(c)){
            System.out.println("Tekrarsız");}else {
            System.out.println("Tekrarlı");}

        String u = "Learn Java earn money";

        int sonuc = u.indexOf("a",6);
        System.out.println(sonuc);

        //isEmpty() methodu bir stringin bos olup olmadıgını kontrol eder eger stringte hiç karakter yoksa isEmpty()
        // true return eder herhangi bir karakter varsa false return eder.
        // length() == 0 demek isEmpty() true demektir
        // length() ==0 methodunu stringin boş olup olmadıgını öğrenmek için kullanılmaz!!
        String v = "           ";
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        String x = "            ";
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);
        //isBlank(); karakter olmadığında da space oldugunda da true verir

        //Example 2: Kullanıcıdan alınan isim mutlaka space ten farklı en az bir karakter içermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println(" lütfen isminizi giriniz");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("sana ismini gir dedim");}else{
            System.out.println(ilk);}















    }
}
