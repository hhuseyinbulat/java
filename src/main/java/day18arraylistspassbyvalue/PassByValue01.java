package day18arraylistspassbyvalue;

public class PassByValue01 {

    // Java variable'ların orjinal degerini korumak ister
    // variablelar methodların içinde kullanıldıgında java methodların içinde orjinal degeri kullanmaz,
    // methoda kopya degeri yollar. Dolayısyla variable'in orjinal degeri konulmus olur. Bu sisteme "Pass By Value" denir

    // Note: Java "Pass By Value" kullanır, bazı prog. dilleri orjinal degeri koruma altına almamıstır, bu isi developerlara
    // bırakmıstır. Bu programlama dilleri "pass by referance" kullanır.


    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        // static method olan main methodun içindeki hersey static olmalıdır
        change(x);//15
        System.out.println(x);//5

        int ücret = 100;
        System.out.println(ücret);
        int kopya = indirim(ücret);
        System.out.println(kopya);
        System.out.println(ücret);
    }
    public static void change(int a) {
        System.out.println(a * 3);}

        public static int indirim (int gömlekUcreti){ return gömlekUcreti - 10;
        }

    }

