package day28abstraction;

public interface Engine {
    /*
    1) Atomic olsun diye “parent”i parcaladim
       ama bir “Child Class” in birden fazla “parent” i oldu bu ise Java’da mumkun degildir.
       Cunku Java “multiple Inheritance” i desteklemez.
    2) Interfaceteki tüm methodlar abstract oldugu için fully abstraction denir.
       Abstract classlarda abstract method ve concrete method bir arada kullanıldıgı için
       abstract classlara fully abstraction denmez.

       multiple inheritance” class’larda mumkun degildir
       fakat Java “interface” isimli yeni bir yapi olusturdu bu yapida “multiple inheritance” a musaade etti.
 */
    //interface'lerdeki tum method'lar "abstract" olmak zorundadir
    //interface'lerde abstract method olustururken "abstract" keyword kullanmaya gerek yoktur.
    //Cunku Java o method'un abstract oldugunu bilir.

    //interface'lerdeki method'lar Java tarafindan otomatik olarak "public" kabul edilir bu yuzden
    //o method'lar icin "public" yazmaya gerek yoktur/

    //public abstract void eco();  ile void eco(); ayni anlama gelir

     /*1) Abstract :
            1.1 - Class`dir.
            1.2 - Abstract ve concrete method`lar konabilir.
            1.3 - Kismi olarak abstraction saglar.
            1.4 - Birden fazla abstract class`a direk child olunamaz. Coklu inheritance`i desteklemez.
            1.5 - Hiz acisindan avantajlidir
            1.6 - Icindeki tum nesnelerin public olmasi zorunlu degildir.
            1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
            1.8 - Abstract class constructor`a sahiptir

   2) Interface :
            2.1 - Class degildir.
            2.2 - Sadece abstract method`lar konabilir.
            2.3 - Tam abstraction (soyutluk) saglar
            2.4 - Bir class`dan istediginiz kadar interface`i inherit edebilirsiniz. Coklu inheritance`a uygundur.
            2.5 - Hiz acisindan abstract class`a gore yavastir.
            2.6 - Icindeki tum nesnelerin public olmasi gerekir.
            2.7 - Method'lar static olamaz
            2.8 - Interface constructor`a sahip değildir    */

    void eco();

    void gas();

    void tsi();

    // "default" keyword kullanarak "ınterface"lerin içinde bodysi olan methodlar üretebilirsiniz
    public default int add(int a, int b ){
        return a+b;
    }
    //"static" keyword kullanarak da "ınterface"lerin içinde bodysi olan methodlar üretebilirsiniz
    public static String update(String str){
        str+="!";
        return str;
    }

}