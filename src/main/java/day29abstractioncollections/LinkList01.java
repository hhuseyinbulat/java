package day29abstractioncollections;

import java.util.LinkedList;
import java.util.List;

public class LinkList01 {
    /*
Collection: birden fazla datanın depolanması.
Array ilkel bu yüzden collectionlara dahil değil.
List'ler collection'lara dahil.

Collection diyince bunlar aklınıza gelmeli:
1)List  i)ArrayList ii)LinkedList
2)Set
3)Queue

>List'lere çoklu ve tekrarlı data depolamak istediğimizde ihtiyaç duyarız, Ör:bir okuldaki öğrenci isimleri.
>>Set'lere çoklu ama tekrarsız data depolamak istersek ihtiyaç duyarız, Ör: bir okuldaki öğrenci ID'leri.
--Set ve List'i amacına göre kullanın.
>>>Queue'lara FIFO(first in first out) veya LIFO(last in firts out) gerektiğinde Queue kullanılır, Ör: bankadaki günlük müşteriler.

 ArrayList’ler index kullanir ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybettirir. Cunku bircok elemanin re-index edilmesi gerekir.
- Arraylist ler index kullanir. Ancak index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
- Cunku bir cok elemanin re-index edilmesi gerekir. Java bu problemi LinkedList olusturarak cozmustur.
- LinkedListte ki her eleman iki bolumden olusur. Bu elemanlarin ilk bolumunde deger(data) olur, ikinci bolumunde ise pointer vardir.
- Iki bolumden olusan farkli bir yapi oldugu icin buna "Node" denilmektedir. Dolayisiyla LinkedList ler hakkinda konusurken List kelimesi
yerine "Node" kelimesini kullanmak yerinde olacaktir.
- Bu yapinin en son elemaninin pointer kismi, kendisinden sonra eleman olmadigi icin "null" gosterir. Son elemana ise "Tail" denilmektedir.
- Her pointer bir elemani gostermeketdir. Ilk bastaki elemani gosteren yapiya "Head" denilir.

-LinkedList eleman ekleme ve eleman silmede cok basarilidir.
-Bu yuzden eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

-NOTE: LinkedList eleman ekleme ve eleman silmede cok basarilidir.
-Bu yuzden eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

-NOTE: ArrayList eleman bulma işlemlerinde (search) çok başarılıdır.
-Ancak  LinkedList eleman bulma (search) işlemlerinde başarısızdır.

==> Çok fazla arama işlemi yapılacağında "ArrayList" kullanmalısınız.
==> Çok fazla eleman ekleme işlemi yapılacaksa "LinkedList" kullanmalısınız.


 */

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();

        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Angelina");
        visitors.add("Brad");
        visitors.add("Tom Hanks");
        System.out.println(visitors);

        visitors.add(2,"Angelina Jolie");
        System.out.println(visitors);
        visitors.addFirst("Cüneyt");
        visitors.addLast("Ajda");
        System.out.println(visitors);
        //LinkedList'ler ekleme ve silme işlemlerinde çok başarılı olduklarından ekleme ve silme ile alakalı çok fazla method içerir.


    }


}
