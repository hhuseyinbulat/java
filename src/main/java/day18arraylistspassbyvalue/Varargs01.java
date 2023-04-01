package day18arraylistspassbyvalue;

public class Varargs01 {
    /*
    1) Farklı sayılardaki parametrelerle calısabilen bir method olusturmak isterseniz varargs kullanmalısınız
    2) Varargs arka tarafta array kullanır, bu yüzden varargslarla calısırken arraylerle calısıyormus gibi davranabilirsiniz
    3) Varargs olusturmak için <data tipi>...<name> seklinde olusturulur
    4) Varargs en sonda olmak sartı ile baska parametrelerle birlikte kullanılır
    5) Varargs en sonda olmak zorunda oldugundan baska bir varargsla birlikte kullanılamaz
     */
    public static void main(String[] args) {
        topla(5,6);
        System.out.println(topla(5,6));
        System.out.println(topla2(5, 6, 7));
        int r1 =topla(2,3);
        System.out.println(r1);

        int r2 =topla(2,3,4);
        System.out.println(r2);

        int r3 =topla(1,2,3,4,5,6,7,8,9,25,56);
        System.out.println(r3);

    }
    public static int topla (int a, int b){ return a+b;}
    public static int topla2 (int a, int b, int c){ return a+b+c;}

    //İstedigimiz kadar sayıyı toplayabileceğimiz bir method olusturalım
    public static int topla (int... a){
        int sum =0;
        for (int w : a){
            sum+=w;
        }
        return sum;
    }


}
