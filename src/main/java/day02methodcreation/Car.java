package day02methodcreation;

public class Car {
    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {
        MethodCreation ilk = new MethodCreation();
        System.out.println(ilk.toplamaYap(3,5));
        Car myHonda = new Car();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.hareketEt();
        myHonda.dur();

    }

    public void hareketEt(){
        System.out.println("Honda guzel hareket eder...");}

    public void dur(){
        System.out.println("Honda Guvenli Durur...");}


}
