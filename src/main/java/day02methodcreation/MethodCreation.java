package day02methodcreation;

public class MethodCreation {
// main method içinde kullanacağınız herşey static olmalıdır. cunku maın mathod statictir.
    public static void main(String[] args) {

    System.out.println(toplamaYap(1.2,5));
    System.out.println(ucSayiyiCarp(2,8,3.2));
    System.out.println("İşlem Sonucu:"+ilkIkiyiToplaUcuncuIleCarp(2,8,3.2));




    }
    // Example 1: Toplama islemi yapan bir method olusturunuz
    public static double toplamaYap(double a, double b){
        return a+b;

    }
    public static double ucSayiyiCarp(double a, double b, double c){
        return a*b*c;
    }

    public static double ilkIkiyiToplaUcuncuIleCarp(double a, double b, double c){
        return (a+b)*c;
    }

}
