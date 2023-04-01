package day32maps;

import java.util.HashMap;

public class Maps02 {


    public static void main(String[] args) {

        //Size verilen bir kelimede kullanılan harflerin kaçar kere kullanıldıgını gösteren kodu yazınız

        String str = "abbcaa";
        String[] arr = str.split("");
        HashMap<String, Integer> gorunum = new HashMap<>();

        for (String w : arr) {

            if (gorunum.get(w) == null) {
                gorunum.put(w, 1);
            } else {
                gorunum.put(w, gorunum.get(w) + 1);
            }
        }
        System.out.println(gorunum);
    }

}
