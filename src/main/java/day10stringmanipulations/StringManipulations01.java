package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String a = "Java kolaydır";
        boolean b = a.startsWith("kola", 5);
        System.out.println(b);

        //replaceFirst() kodu stringteki ilk a yı * e çevirir.
        //replace() kodu tüm a ları * e çevirir.
        String c = a.replaceFirst("a", "*");
        System.out.println(c);


        //concat() method'u iki tane String'i birbirine yapistirmaya yarar.
        //"Concatenation" islemi iki turlu yapilabilir; i)+ ile ii)concat() ile
        //Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.
        String d = a.concat(" Anladin mi?");
        System.out.println(d);//Java kolaydir. Anladin mi?

        //trim() methodu bir stringin baş ve sonundaki space karakterlerini siler aradakilerine dokunmaz
        String e = "   Tom Hanks   ";
        System.out.println(e);
        String f = e.trim();
        System.out.println(f);



        //CompareTo(i) kodu iki tane Stringi albafetik (lexicographic ) olarak karsilastirir.
        //Buyuk harf ve kucuk harfe duyarlidir.
        //Buyuk harf kucuk harfe duyarli olmasini istemezsiniz CompareToIgnoreCase i kullanabilirsiniz.
        //Bu kodda H"nin alfabetik sirasinda "i"nin alfabetik sirasi cikarilir.
        String h= "Jbva";
        String i ="Java";
        int k= h.compareTo(i);
        System.out.println(k);


        String n = a.repeat(3);
        System.out.println(n);











    }
}
