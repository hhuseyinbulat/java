package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");


        //Example01: iterators kullanarak list elemanlarınıtersten konsola yazdırınız

        ListIterator<String> itr =myList.listIterator(); //myList objesinden yeni bir itr objesi olusturduk

        while (itr.hasNext()){
            itr.next();
        }

        while(itr.hasPrevious()){
            String el =itr.previous();
            System.out.print(el+" ");
        }

          // hasPrevious() methodu, pointer'dan önce eleman varsa true, yoksa false return eder.
          // hasNext() methodu, pointer'ı bir önceki elemanın sonuna koyar ve üstünden atladığı elemanı return eder.

        //Example 02 : Listdeki tüme elemanları silen bir kod yazınız
        System.out.println(myList);

        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.println(myList);



        //1)hasNext()  2)next()  3)set()  4)hasPrevios()  5)previous   6)remove()  ogrendik



        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator = yourList.iterator();

        while(iterator.hasNext()){
            String el = iterator.next();
            System.out.print(el);
        }


    }
}
