package day25exception;

public class E01 {
    /*
    1) Exception (istisnai hata): javada kodlarımızı calıstırırken meydana gelen beklenmedik durumlardır.
    2) Exception'lar ile calismanin 2 yolu vardır;

      i)  "try-catch" blogunu kullanma ve exception oluşsa bile çalışmayı devam ettirme.
      ii) "throw exception" kullanarak calismayi durdurma.
           Örneğin yazdıgımız kod geregi bir dosya uzerinden okuma yapmamız gerekiyor ise
           bu dosya eger silinmiş ise java bu dosyayı bulamaz
           dolayısıyla uygulamanın calısmaya devam etmesine gerek kalmaz

    3) Eger exception'ı handle etmezsek java calismayı durdurur.
    4) try catch kullanırken try kodunu bir ya da birden fazla catch ile birlikte kullanabiliriz.
    5) try catch olmaksızın tek basına kullanılamaz.
    6) eger yazmıs oldugunuz herahngi bir kod satırında problem olabilecegini düşünüyorsanız
       try catch block içine koymalısınız.
    7) Catch blok parantezi içerisine olmasi muhtemel exception class ismi yazılır.
    8) e.getmessage() methodunu kullanarak teknik mesajlar elde edebiliriz
       e.printStackTrace() methoduyla detaylıca teknik mesajlar elde edebiliriz
       System.err.println(); renkli yazı yazdırır.
    9) Eger try calısırsa catch calısmaz

     */

    public static void main(String[] args) {

        //divide(3, 0);
        divide2(5,0);


    }

    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayi sifir ile bolunemez");
        } else {
            System.out.println(a / b);
        }

    }
    public static void divide2(int a, int b) {
        try {
            System.out.println(a / b);
        }catch (ArithmeticException e){
            System.out.println("bolme isleminde bir hata olustu");

        }
        // Note: Java matematik ile ilgili karsılasılması muhtemel tüm hataları "aritmaticexception" classına koymuştur.
        //       Böylelikle matematikteki tüm olası hataları bilmek zorunda kalmıyoruz.
    }


}
