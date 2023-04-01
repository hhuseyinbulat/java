package day29abstractioncollections;

public interface Engine extends Vehicle {

    // Class ---> Interface ==> implements
    // Class ---> Class     ==> extends
    // Interface ---> Interface ==> extends
    // Interface ---> Class ==> Mumkun degil


    //interface'lerdeki tüm variable'lar otomatik olarak(default) "public"dir.
    //interface'lerdeki tüm variable'lar otomatik olarak(default) "final"dir.
    //interface'lerdeki tüm variable'lar otomatik olarak(default) "static"dir.

    void run();
    void price();

    int price = 2000;
    double weight =23.5;

}
