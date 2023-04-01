package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    /*
    1) StringBuilder Java'da bir Class'tır

    2) StringBuilder String olusturmaya yarar

    3) String Class varken neden StringBuilder a ihtiyac duyarız? Çünkü;
       String Class "Immutable Class"tır ama biz bazen mutable String e ihtiyac duyarız.
       StringBuilder bize "Mutable" String verir

    4)"Immutable Class" larda var olan deger degistirilemez siz o degeri degistirmek istediginizde
       İ) Memoryde yeni bir variable yeni degerle olusturulur
       ii) Eski variable ın pointer i yeni variable a döndürülür
       iii) Eger bir variable ı hiçbir pointer göstermiyorsa o variable garbage collector tarafından silinir


       "Mutable Class"larda var olan degistirilebilir, orjinal deger korunmaz

     5) String Class ların Immutable yapısı securty icin önemlidir.

       Aynı degere sahip birden fazla string oldugunda
       java bir tane konteynır olusturur ve aynı degere sahip stringlerin bu conteynırı kullanmasını temin eder.

       Bu memory i korumak icin iyidir ancak konteynırdaki degeri bir variable icin degistirdigimizde
       tüm variable ların etkilenmesi tehlikesi vardır.

       Bu tehlikeden kurtulmak için java Stringleri Immutable(degismez)
       yapmıstır.

       Fakat herhangi bir variableın degerini degistrimek için java bir yol bulmustur.

       Degistirmek istediginiz variable icin yeni birr conteynır olusturur ve variableın pointerini bu yeni variable a yönlendirir
       Bölelikle hem degisim saglanmıs hem de diğerleri etkilenmemis olur.


           */
    public static void main(String[] args) {
        String vtr ="Java";
        String str = "Java";
        str="Superjava";


        //StringBuilder nasıl olusturulur:

        // 1.yol:
        StringBuilder strb = new StringBuilder("Java");

        // 2.yol:
        StringBuilder strb2 = new StringBuilder(); //Boş bir StringBuilder olustu.

        // Yol a)
        strb2.append("Java");
        System.out.println(strb2);
        strb2.append(" is easy"); // Stringlerdeki concatle aynı fonksiyon
        System.out.println(strb2);

        //yol b)
        strb2.append(" to learn").append(" :)");
        System.out.println(strb2);

        //StringBuilder larda karakter sayısı nasıl bulunur
         StringBuilder strb3 = new StringBuilder();
         strb3.append("catxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
         int numOfChar = strb3.length();
        System.out.println(numOfChar);
        int a =strb3.capacity();
        System.out.println(a);

        //Capacity asımlarında var olanın 2 katının 2 fazlasına cıkar

        strb3.setCharAt(2,'r'); // İndeks 2 deki karakteri r ye cevirir
        System.out.println(strb3);

        strb3.delete(3,48);
        System.out.println(strb3);

        strb3.deleteCharAt(3);
        System.out.println(strb3);

        strb3.reverse();
        System.out.println(strb3);

        String abc ="Java";
        abc = abc.replace("a","i");
        System.out.println(abc);

        // to string methodu String Builder ları stringlere cevirir.
        String Stringstrb3 =strb3.toString();
        System.out.println(Stringstrb3);

        //String den de StringBuilder a dönüs;
        StringBuilder strb4 = new StringBuilder(Stringstrb3);

        strb4.insert(2,"XXXX");
        System.out.println(strb4);

        strb4.insert(2,"YYYYYY",2,4);
        System.out.println(strb4);


        StringBuilder ab = new StringBuilder("Kava");
        StringBuilder ac = new StringBuilder("Java");

        // compare to methodu StringBuilderlar tamamı ile aynı ise 0 sonuc verir.
        int sonuc = ab.compareTo(ac);
        System.out.println(sonuc);


    }
}
