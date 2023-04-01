package day29abstractioncollections;

public class Civic implements Engine, Ac {

/*
    * "abstract method"lar sadece ne yapilacagini soyler.(What to do)
    * "concrete method"lar ne yapilacagi ile birlikte nasil yapilacagini de soyler.(How to do)

    * "interface"ler yapilacak isler listesidir. (To do list)

    * "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz
       bu methodlarin return typle'lari ayni olmalidir aksi takdirde hata verir.

    * * "interface" lerde constructor olmadığı için interface'lerden object oluşturulamaz.
      "abstract class" lar class oldukları için constructor vardır. Ama constructor'lar abstract class'larda object oluşturamazlar.

    * *  Javada interfacelerden(constructor yok çünkü) ve abstract class lardan object oluşturulamaz.

    * * Soru: "Abstract Class" ile "Interface" in farklari nelerdir?
       1)Method
            "Abstract Class" hem abstract hem de concrete method lar icerebilir.
            "Interface" ler ise sadece abstract method'lar icerir.
            Ama istersek interface'ler icinde de "default" ve "static" keyword'ler kullanarak concrete method lar olusturabiliriz.

       2)Variable
            "Abstract Class" larda normal Class'lardaki gibi her turlu variable olusturulabilir.
            "Interface" lerde ise variable'lar public static ve final olmak zorundadir.

       3)Inheritance
            "Abstract Class" lar class olduklari icin multiple inheritance'a musaade etmezle.
            "Interface" ler ise multiple inheritance'i desteklerler.

       4)Object Creation
            "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
            "Interface" lerde ise constructor olmadigindan object olusturulamaz.

            *
 */

    @Override
    public void run() {
        System.out.println("civics run well");
    }

    @Override
    public void price() {

    }


}
