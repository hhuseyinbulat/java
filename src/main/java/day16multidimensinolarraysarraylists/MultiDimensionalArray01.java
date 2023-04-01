package day16multidimensinolarraysarraylists;

// Array veya collection varsa for each loop kullanmak birinci tercih
// Array veya collection varsa ve indeks kullanmak zorundaysanız o zaman for each çalışmaz
// diğer loopları kullanmak zorundasınız

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
        // int bir multidimensinol olusturunuz, bu arraydeki tüm sayıların toplamını veren kodu yazınız
        int arr[][]={{2,5,1},{32,75},{13,21,43,56}};
        int sum =0;
        for (int[] w: arr){
            for (int k: w){
                sum=sum+k;
            }
        }
        System.out.println(sum);

        // bir multidimensinol arrayi normal arraye çeviren kodu yazınız
        //{{2,5,1},{32,75}}

        // 1. adım: multidimensinol arraydeki eleman sayısını bulunuz

        int brr[][]={{2,5,1},{32,75}};
        int toplam=0;

        for (int [] w:brr){
            toplam=toplam+ w.length;

        }

        int crr[]=new int[toplam];
        int idx=0;

        for (int[] w:brr){
            for (int k:w){
                crr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));



    }
}
