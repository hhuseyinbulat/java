package day32maps;

public class StaticBlocks01 {

    public static double pi;


    static {
        pi = 3.14;
        System.out.println("Static blok 1");
    }

    //"Static bloklar" ihtiyacımız olan variable'ların class olusturma safhasında elimizde olmasını saglar.
    //"Static bloklar" class içindeki her şeyden önce çalıştırılır.(Main methodtan da önce)
    //"Static bloklar" içinde sadece static variable'lara deger atanabilir.

    public static void main(String[] args) {
        System.out.println("Static blok main");

    }

    //Birden fazla static blok varsa üstteki daha önce çalıştırılır. Ama her ikisi de mainden önce çalışır
    static {
        pi = 3.14;
        System.out.println("Static blok 2");
    }
}
