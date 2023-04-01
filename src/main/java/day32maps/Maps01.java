package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {
        /*
        Size verilen bir cümledeki her kelimenin kaç kere kullanıldıgını gösteren kodu yazınız
        String str = "I like to move it move it"
         */

        String str = "I like to move it, move it.";
        String []arr = str.replaceAll("[\\p{Punct}]","").split(" ");
        System.out.println(Arrays.toString(arr));
        HashMap<String,Integer> gorunum = new HashMap<>();
        for (String w : arr){
            Integer gorunumSayisi = gorunum.get(w);

            if (gorunumSayisi==null){

                gorunum.put(w,1);
            }else {
                gorunum.put(w,gorunumSayisi+1);
            }
        }
        System.out.println(gorunum);

    }

}
