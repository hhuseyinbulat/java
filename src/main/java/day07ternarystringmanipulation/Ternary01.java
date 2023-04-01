package day07ternarystringmanipulation;


import org.w3c.dom.ls.LSOutput;

public class Ternary01 {
    public static void main(String[] args) {

        // bir sayının pozitif olup olmadıgını ekrana yazdıran kod

        int a = 12;
        if (a>0){
            System.out.println("pozitif");}
        else{
            System.out.println("pozitif değil");}

        //2: yol      // condition ?  contion doğruysa   :    condition yanlışsa
        String sonuc =       a>0   ?   "pozitif"         :      "pozitif değil";
        System.out.println(sonuc);


        // iki sayıdan küçük olanı seçen kod

        int b = -120 , c = -23;
        int sonuc1 = b<c ? b : c;
        System.out.println(sonuc1);


        // verilen bir sayının mutlak değerini hesaplayan kodu yazınız

        int d = 120;
        int newD = Math.abs(d);
        int sonuc2 =d<0 ? newD : d;
        System.out.println(sonuc2);

        //iki değerin işareti aynı ise bu değerleri çarp değilse işlem yapamam de
        int e = 12, f =10;
        Object sonuc3 = e*f >0 ? e*f : "İşlem yapamam";
        System.out.println(sonuc3);

        // Ternary farklı data tiplerinde sonuc return ederse sonucun data tipini object yapınız

        //







    }
}
