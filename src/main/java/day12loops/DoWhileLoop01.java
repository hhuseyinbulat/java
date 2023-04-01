package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //while-loop için loop body'si içindeki kodun hiç çalıştırılmama ihtimali vardır.
        //do-while-loop'un body'si içindeki kod her halükarda en az bir kere çalışır.

        //Example 1 : Bir ondalık sayının ondalık kısmındaki rakamlarının toplamını bulunuz

        double num = 24.5673;
        System.out.println(num);

        //valueOf() methodu parantez içine konulan datanın tipini String yapar
        String str =String.valueOf(num);
        System.out.println(str);

        // Regex için nokta kullandığınızda önüne \\ koyunuz. Yani nokta \\. şu şekilde kullanılır
        String decimalPart = str.split("\\.")[1];
        int decimalInt = Integer.valueOf(decimalPart);
        int sum = 0;
        do {
            sum=sum+decimalInt%10;
            decimalInt=decimalInt/10;
        }while (decimalInt>0);
            System.out.println(sum);




    }
}
