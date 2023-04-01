package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
//        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
//        //            [2, 3, 12, 0,  0,  0]
//        int original[] = {0, 12, -3, 0};
//        int yeni[] = new int[original.length];
//
//        int idx = 0;
//        for (int i = 0; i < original.length; i++) {
//            if (original[i] != 0) {
//                yeni[idx] = original[i];
//                idx++;
//            }
//        }
//        System.out.println(Arrays.toString(yeni));
//
//        //Example 2 bir arrayin içinde herhangi bir elemanın olup olmadığını
//        // ve kaç kere tekrarlandığını gösteren ve kontrol eden kodu yazınız
//
//        int arr[] = {2, 1, 2, -3, 2};
//        int eleman = 2;
//        int counter = 0;
//
//        for (int w : arr) {
//            if (w == eleman) {
//                counter++;
//            }
//        }
//        if (counter > 0) {
//            System.out.println(eleman + " arrayde " + counter + " defa var");
//        } else System.out.println(eleman + " arrayde yok");

        // Size verilen cümledeki en uzun kelimeyi bulunuz
        // "Java kolaydır çalışana ne kolay ki çalışmayana"

        String cumle ="Java kolaydır çalışana, ne kolay ki çalışmayana.";
        System.out.println(cumle);
        cumle =cumle.replaceAll("\\p{Punct}","");
        System.out.println(cumle);

        String word[] = cumle.split(" ");
        Arrays.sort(word, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(word));
        System.out.println(word[word.length-1]);


    }

}
