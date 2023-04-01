package day08stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example 1 : Bir stringteki space hariç kaç tane karakter kullanıldıgını gösteren kodu yazınız
        //            ali okula gitti
        String str = "Ali okula gitti.";
       int num = str.replace(" ","").length();
        System.out.println(num);

        //Example 2 : Bir stringteki tüm a harflerini A ya çeviriniz
        String s = "Ankaranın tasina gözlerimin yasina bak.";
        String newS = s.replace("a","A");
        System.out.println(newS);

        //Example 3 : Bir Stringteki tüm "kara" kelimelerinin yerine "*" koyunuz

        String t = "Kara kara bulutlar Ankara";
        String newT = t.replace("kara","*");
        System.out.println(newT);

        //Example 4 : Bir stringteki tüm sayıları "*" a ceviriniz

        String stdId = "AC2334354";
        String newStdId = stdId.replaceAll("[0-9]","*");
        System.out.println(newStdId);

        /*
    Bir grup data'yı ifade eden kodlara "Regex" denir.
    "Regex" Regular Expressions'in kısaltılmış halidir.

    1)Tüm rakamlar ==> [0-9]
    2)Tüm küçük harfler ==> [a-z]
    3)Tüm büyük harfler ==> [A-Z]
    4)Tüm harfler ==> [a-zA-Z]
    5)Sesli hardler ==> [aeiouAEIOU]
    6)Space ==> [ ]
    7)Tüm rakamlar ve tüm harfler ==>[0-9a-zA-Z]
    8) Tüm noktalama işaretleri ==> \\p{Punct}   unutursan google a noktalama işaretleri için regex yaz



    1) Rakamlar haric tum karakterler ==> [^0-9]
    2) kucuk harfler haric butun karakterler ==> [^a-z]
    3) Buyuk harfler haric tum karakterler.==> [^A-Z]
    4) Tum harfler haric tum karakterler ==> [^a-zA-Z]
    5) Space haric ==> [^ ]


    /*
		 1)  \\d    Tum rakamlar
		 	 \\D 	Tum rakam disi karakterler

		 2) \\w  ==>  A->Z    a->z    0->9 _   karakterlerinin tamamini icerir.
		 	\\W  ==>  A->Z    a->z    0->9 _   bunlarin disidaki karakterlerinin tamamini icerir.

		 3) \\s  ==>  space
		 	\\S  ==>  space disindaki her sey


     System.out.println(s4.replaceAll("\\d", "*")); //Code* yazarak* ogrenilir*
     System.out.println(s4.replaceAll("\\D", "*")); //****1********2**********3
     System.out.println(s4.replaceAll("\\w", "*")); //***** ******** **********
     System.out.println(s4.replaceAll("\\W", "*")); //Code1*yazarak2*ogrenilir3
     System.out.println(s4.replaceAll("\\s", "*")); //Code1*yazarak2*ogrenilir3
     System.out.println(s4.replaceAll("\\S", "*")); //***** ******** **********
    */
        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
//           tum karakterlerin sayisini bulan kodu yaziniz

        String u = "Ali 13 yasinda, dersem inanma!...";
        int sonuc = u.
                     replaceAll("[0-9]", "").
                     replace(" ","").
                     replaceAll("\\p{Punct}","").
                     length();
                     System.out.println(sonuc);
        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
//           i)Space haric en az sekiz karakter olmali
//           ii)En az 1 sembol icermeli
//           iii)En az 1 rakam icermeli
//           iv)En az 1 buyuk harf icermeli
//           v)En az 1 kucuk harf icermeli

        String pwd = "B78c? K!m";

        // i)Space haric en az sekiz karakter olmali
        boolean first =pwd.replace(" ","").length()>7;

        // ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;

        //iii)En az 1 rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;

        //iv)En az 1 buyuk harf icermeli

        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;

        //v)En az 1 kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if (pwdGecerli){
            System.out.println("passwordünüz geçerli");}
        else{
            System.out.println(" geçersiz");}

        //Example 7:Bir stringteki noktalama işaretlerinin sayısını gösteren kodu yazınız

        String cümle = "Sen yapmazsan, ben ?...";
        int number = cümle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(number);

        //Example 8: Verilen bir string "Al" ile başlıyor ve "x" ile bitiyorsa ekrana harika aksi halde normal yazdırın

        String v = "Alex";
        boolean baslangıc = v.startsWith("al");
        boolean bitis = v.endsWith("x");
        String sonuc34 = baslangıc && bitis ? " harika" : "normal";
        System.out.println(sonuc34);







    }
}
