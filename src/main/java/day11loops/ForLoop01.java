package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {

       // 3ten 6 ya kadar tam sayıların toplamını bulann kodu yazınız
        int sum = 0;
        for (int i = 3; i<7;  i++){
            sum = sum+i;
        }
        // Note: sout loopun dısına yazılırsa sadece sum ın sadece son degerini ekrana yazdırır
        //Loopun içine yazılrsa her bir loop için sum ın hangi degerleri aldıgını yazdırır.
        System.out.println(sum);

        // Example 2 : 6 dan 3 e kadar tam sayıların çarpımını bulan kodu

        int multiply = 1;
        for (int i = 6; i>2;i--){

            multiply*=i;

        }
        System.out.println(multiply);

        //size verilen bir tam sayının rakamları toplamını bulun

        int num = 385;
       int sonuc = 0;
       num = Math.abs(num);


       for ( int i =num  ; i>0   ; i=i/10){
           sonuc=sonuc + i%10;
        }
        System.out.println(sonuc);
       //Example 4: Size verilen bir stringi ters çeviren kodu yazınız
        String str = "Kaba";

        String tersStr="";

        for (int i = str.length()-1; i>-1;i--){
            char c =str.charAt(i);
            tersStr = tersStr+c;
        }
        System.out.println(tersStr);





























    }
}
