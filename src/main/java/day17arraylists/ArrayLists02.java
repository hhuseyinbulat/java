package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {
    public static void main(String[] args) {
        //Example 1:Verilen bir listteki elemanları tekrarsız olarak yazınız
        // [2,3,2,2,5] ==> [2,3,5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> yeni = new ArrayList<>();
        for (Integer w : a) {
            if (!yeni.contains(w)) {
                yeni.add(w);
            }
        }
        System.out.println(yeni);

        // Example 2 : Kullanıcıdan bir harf alınız, harf sizdeki listin içinde varsa o harfi "bulundu" ya ceviriniz
        //yoksa o harfi liste ekleyiniz
        Scanner input = new Scanner(System.in);

        String harf = "";

        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        do {
            System.out.println("Lutfen bir harf giriniz");
            harf = input.next().substring(0, 1);

            if (c.contains(harf)) {
                c.set(c.indexOf(harf), "Bulundu");
            } else if(!harf.equals("Q")){
                c.add(harf);
            }
            System.out.println(c);
        }while(!harf.equals("Q"));




    }
}
