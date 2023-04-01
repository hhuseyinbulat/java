package day13loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    /*
    1) Aynı data tipinde çoklu datayı depolamak için javanın olusturdugu yapılar vardır.
    bu yapılardan birisi de "Array" lerdir.
    */
    public static void main(String[] args) {
        int stdAges[] = new int[7];
        System.out.println(Arrays.toString(stdAges));

        // Arraylere elemanlar nasıl eklenir;


        stdAges[0]=12;
        stdAges[1]=11;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;
        System.out.println(Arrays.toString(stdAges));

        // Arraydeki herhangi bir elemanı nasıl yazdırabiliriz

        System.out.println(stdAges[4]);

        // Example : Arraydeki en küçük ve en büyük elamanın toplamını yazdırınız

        Arrays.sort(stdAges);
        int ilk = stdAges[0];
        int son = stdAges[stdAges.length-1];
        System.out.println(ilk+son);

        //Example 2 : stdAges arrayi içerisindeki tüm elamanların toplamını ekrana yazdıran kodu ekrana yazdırınız

        // 1. yol :
        int sum = 0;
        for(int i =0 ;i<stdAges.length;i++){
            sum=sum+stdAges[i];
        }
        System.out.println(sum);

        // 2. yol :
        int sum1 = 0;
        int i = 0;
        while (i<stdAges.length){
            sum1=sum1+stdAges[i];
            i++;
        }
        System.out.println(sum1);

        // 3. Yol:
        int toplam =0;
        int k=0;
        do {
            toplam=toplam+stdAges[k];
            k++;
        }while (k<stdAges.length);
        System.out.println(toplam);


        // 4. yol: for each loop arraylerde ve collectionslarda kullanılır

        int t =0;
        for (int w :stdAges){
            t=t+w;
        }
        System.out.println(t);

        // Example 3: String bir array oluşturunuz bu arraye 5 tane isim yerleştiriniz sonra bu isimlerdeki karakter sayılarının toplamanı ekrana yazdırınız

        String names[] = new String[5];

        names[0]="Ali";
        names[1]="Tom";
        names[2]="Veli";
        names[3]="Kemal";
        names[4]="Cem";

        int sum2 = 0;
        for (String w :names){
            sum2=sum2+ w.length();

        }
        System.out.println(sum2);

        // Example 4: char bir array oluşturunuz bu array e 5 eleman ekleyiniz sonra bu arraydeki sadece büyük harfleri ekrana yazdırınz

        char karaketer[] ={'A','c','D','k','m'};
        for (char w : karaketer){
            if (w>='A' && w<='Z'){
                System.out.print(w);
            }

        }









    }
}
