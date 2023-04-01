package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {
        // bir array in elemanları array ise bu arrayler multidimensinol array dir


        //Multidimensinol array olusturma:
        int arr [][] = new int[3][2];
        System.out.println(Arrays.deepToString(arr));

        //Multidimensinol arraylere eleman ekleme:

        arr[0][0]=3;
        arr[0][1]=-4;
        arr[1][0]=6;
        arr[1][1]=18;
        arr[2][0]=-7;
        arr[2][1]=0;

        //Multidimensinol array consola nasıl yazdırılır
        System.out.println(Arrays.deepToString(arr));

        //Multidimensinol arraylerde array elemanlarından birisi nasıl yazdırılır
        System.out.println(Arrays.toString(arr[1]));

        //Multidimensinol arraylerde arraylerde arraylerdeki iç elemanlar nasıl yazdırılır
        System.out.println(arr[1][0]);
        //Example 1 :string bir multidimensinol array olusturunuz elemanları ekleyiniz
        // sonra da toplam elelamn sayısını ekrana yazdıran kodu yazınız

        String brr[][]= new String[4][3];
        brr[0][0]="A";
        brr[0][1]="B";
        brr[0][2]="C";

        brr[1][0]="D";
        brr[1][1]="E";
        brr[1][2]="F";

        brr[2][0]="G";
        brr[2][1]="H";
        brr[2][2]="I";

        brr[3][0]="J";
        brr[3][1]="K";
        brr[3][2]="L";
        System.out.println(Arrays.deepToString(brr));

        int sum =0;
        for (String[] w:brr
             ) {sum=sum+w.length;

        }
        System.out.println(sum);




    }
}
