package day26exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);

        String st = "1a2b";//NumberFormatException: Eger icinde rakamdan farkli character barindiran bir String'i
                           //valueOf() kullanark Integer'a cevirmek isterseniz NumberFormatException alirsiniz
        int r = convertStringToInteger(st);
        System.out.println(r + 10);

    }

    public static int convertStringToInteger(String str) {
        int i = 0;
        try {
            i = Integer.valueOf(str);
            //Herhangi bir satirda "Exception" atilirsa Java direkt "catch" bolumune gecer try icindeki sonraki kodlari calistirmaz
            System.out.println("burası try bölümü");
        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter içeren Stringler integer'a çevrilemez!");
        }
        return i;
    }

}
