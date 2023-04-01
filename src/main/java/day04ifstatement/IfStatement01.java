package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        // If statement belli kodları belli sartlara baglı olarak calıstırmaya yarar.

        //Example 1: Sayı pozitifse ekrana pozitif yazdırın:

        int s = 12;

        if (s > 0) {
            System.out.println("Pozitif");

            //Example 2:

            char ch = 'A';
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("Büyük Harf");
            }

                /*Note:  && = and   islemi sadece boolean ile kullanılır.
                true && true = true
                true && false = false
                false && true = false
                false && false = false */

            //Example:3 Verilen bir sayı üç basamaklı ise üç basamaklı yazdırınız

            int sayı = -100;

            sayı = Math.abs(sayı);

            if (sayı < 1000 && sayı > 99) {
                System.out.println("üç basamaklı");

                //Example 4: Verilen bir sayı çift sayı ise çift sayı yazdırınız

                int p = 14;
                p = Math.abs(p);

                if (p % 2 == 0) {
                    System.out.println("Çift sayı");

                    //Example 4:

                    int r = 250;

                    if (r < 300 || r > 1200) {
                        System.out.println("Harika Sayı");

                          /*
                            || islemi sadece boolean ile kullanilir.
                                     true || true = true
                                     true || false= true
                                    false || true= true
                                    false || false= false
                                                              */

                    }


                }

            }


        }


    }
}
