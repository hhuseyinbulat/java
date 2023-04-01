package day03typecastingwrapperscanner;

public class TypeCasting01 {
    /*
          Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
                     byte < short < int < long < float < double

          Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
          Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir
     */
    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int)population;

        //Example 1  Auto Widening:

        short paket = 25000;
        double newPaket = paket;

        //Example 2 Explicit Narrowing:

        float price = 15.5f;
        byte newPrice = (byte)price;

        System.out.println(newPrice);

        // Java ondalıklı sayıyı tam sayıya çevirirken yuvarlama işlemi yapmaz, virgülden sonrasını siler.

        int number = 515 ;
        byte newNumber = (byte)number;

        System.out.println(newNumber);

        int num = 510;
        byte newNum = (byte)num;

        System.out.println(newNum);


    }

}
