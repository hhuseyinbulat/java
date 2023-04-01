package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Tomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Tacettin");
        System.out.println(names);

        List<String> cityies = new ArrayList<>();
        cityies.add("Trump");
        cityies.add("Tom");
        cityies.add("Tacettin");


        names.removeAll(cityies);// removeAll kullandıgınızda saddece ilk list degisir parantezin içindeki list degismez
        System.out.println(names);


        List<String> myNames = new ArrayList<>();

        myNames.add("Tomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames);
        System.out.println(sonuc1);

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        //Example 1 ) a listinde "Shoes" elemanının ilk görünümünü siliniz

        a.remove("Shoes");
        System.out.println(a);

        //Example 2 ) a listinde "Shoes" elemanının tüm görünümlerini siliniz
        List<String> delete = new ArrayList<>();
        delete.add("Shoes");
        a.removeAll(delete);
        System.out.println(a);

        //Example 3) Bir tane salary listi olusturunuz eger salary 10000 den az ise %20 10000 ve 10000 den cok ıse %10 zam yapınız
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);

        for (Double w : salary) {
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);
            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
        }
        System.out.println(salary);

        //Example 4 ) İki arrayin eşit olup olmadıgını control eden kodu yazınız

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        // 1. Yol:
        int counter = 0;

        for (int i = 0; i < m.size(); i++) {
            if (m.size()!=n.size()){
                System.out.println("Listler esit değildir");
                counter++;
                break;
            }
            else if (m.get(i) != n.get(i)) {
                System.out.println("Listler esit değildir");
                counter++;
                break;
            }

        }
        if (counter == 0) {
            System.out.println("Listler esittir");
        }
        // 2 Array listin esit olabilmesi için elemanlar aynı ve aynı elemanlar aynı indekste olmalı

        // 2. Yol:

        boolean aynıMı = m.equals(n);
        if (aynıMı){
            System.out.println("Listler esittir");}
        else System.out.println("Listler esit değildir");


    }
}
