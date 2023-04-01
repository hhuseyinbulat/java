package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    /*
    1) method isimleri aynı olmalıdır
    2) method parametreleri farklı olmalıdır
        i) parametre sayıları degıstırılebilir
        ii) Parametrelerin data tiplerini degistirebilirsiniz
        iii) parametrelerin yerlerini degistirebilirsiniz (data tipleri farklı ise)
    3) methodun ismi + parametreler methodun imzasıdır.
    Method signature dısında ne degıstırırsenız degıstırın java o methodları farklı kabul etmez
     */
    public static void main(String[] args) {



        add(3,5,9);

    }
    public static void add(int a, int b){
        System.out.println(a+b);}

    public static void add(int a, int b, int c){
        System.out.println(a+b+c);}

    public static void add(int a, double b){
        System.out.println(a+b);}

    public static void add(double a, int b){
        System.out.println(a+b);}


}
