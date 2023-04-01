package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {
        //Example 1: bir stringteki m karakteri hariçtüm karakterleri yazınız
        // Andromeda
        // 1: Yol
        String str = "Andromeda";
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (c != 'm') {
                System.out.println(c);
            }
        }
        //2.Yol:
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'm') {
                continue;
            }

            System.out.println(c);


        }
        //Example 1 den 100 e kadar olan tüm sayıları 6 ile bölünenler hariç ekrana yazdırınız

        for (int i = 1; i<101; i++){
            if (i%6==0){
                continue;

            }
            System.out.print(i+" ");
        }
        System.out.println();
        //Example 3:verilen bir stringteki m den önceki karakterleri yazdırınız
        // Lüksemburg

        String s = "Lüksemburg";
        for (int i =0; i <s.length();i++){
            char c =s.charAt(i);
            if(c=='m'){
                break;
            }
            System.out.print(c);
        }













    }
}
