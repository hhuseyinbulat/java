package day22inheritancepolymorphism;

public class HondaAccord extends Honda{
    /*
    1) Siz class olusturdugunuzda java otomatık olarak sıze bir constructor verir cunku java classın bir templed
    oldugunu ve object olusturmak ıcın yaratıldıgını ve object olusturmak ıcın constructor ın sart oldugunu bilir

    2) Javanın oto olarak olusturdugu bu görünmez constructor a default constructor denir

    3) Siz kendiniz herhangi bir constructor olusturdugunuzda java default constructoru sıler

    4) Bir classta birden fazla constructor olabilir. fakat bu constructorların parametreleri farklı olmalıdır
    5) this keyword ==> "bu class" anlamındadır this.price ==> "bu classtaki price isimli variable" demektir
        this.price syntax i constructorların içinde kullanılır.
    6) Constructor kullanarak variable üzerinde yaptıgınız degisimler sadece object üzerindeki variableların degerlerini degistrir
       classtaki variable degerlerini
     */
    public  int price;
    public  int year;

    public String make;
    public String model;

    public HondaAccord(){

    }

    public HondaAccord (int price){
        this.price=price;

    }

    public HondaAccord (int price, int year){

        this.price=price;
        this.year=year;
        System.out.println("Hoda Accord Constructor");

    }
    public HondaAccord(int price, int year, String make, String model){
        this.price=price;
        this.year= year;
        this.make= make;
        this.model= model;
    }
}
