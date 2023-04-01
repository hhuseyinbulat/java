package day16multidimensinolarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    /*
    Arraylist'ler aynı data tipine sahip birden fazla datayı depolamak için kullanılır

                                      Array ile ArrayList in farkları

    1) Array olustururken arrayın ıcıne kaç eleman koyacağımızı söylemeliyiz ve söylediğimizden fazla eleman koyamayız

       Yani arrayler eleman sayısında "fixed" dirler.
       ArrayListleri olustururken eleman sayısı belirtmeye gerek yok çünkü arraylistler eleman sayısında "flexible"dırlar.

    2) Arraylerin içine primitive ve referanceler bulunurken arraListler'de sadece non-primitiveler kullanılır

    3) Arrayler "superfast" dir.
       Arrayler memoryi çok az kullanır.

       note: eleman sayısı kesin belli olan çoklu dataları depolamak için array kullanırız ama eleman sayısı değişken olan
             çoklu datalar için array kullanma riski almamalıyız.

     */
    public static void main(String[] args) {
        // ArrayList nasıl olusturulur

        //1.yol
        ArrayList<Integer> age = new ArrayList<Integer>();

        //2.yol
        ArrayList<Integer> heights = new ArrayList<>();

        //3.yol
        List<Integer> nums = new ArrayList<>();


        // ArrayListler nasıl yazdırılır?
        System.out.println(nums);

        // ArrayListlere nasıl eleman eklenir?
        nums.add(21);
        nums.add(18);
        nums.add(1,14);
        System.out.println(nums);

        List<Integer> prices= new ArrayList<>();
        prices.add(23);
        prices.add(81);


        nums.addAll(prices);
        System.out.println(nums);

        nums.addAll(2,prices);
        System.out.println(nums);

        //size bize list in eleman sayısını verir
        int a =nums.size();
        System.out.println(a);

        //get methodu istenen bir indeksteki elemanı verir
        System.out.println(nums.get(3));

        // list in boş olup olmadıgını kontrol etmek için isEmpty
        boolean b = nums.isEmpty();
        boolean c = age.isEmpty();
        System.out.println(b);
        System.out.println(c);

        //Array listte bir eleman nasıl degistirilir
        nums.set(2,22);
        System.out.println(nums);

        // Example 1: nums array listindeki tüm tek sayıları 11 artırdıktan sonra ekrana yazdırınız

        for (Integer w : nums){
            if (w%2!=0){
                nums.set(nums.indexOf(w),w+11);
            }

        }
        System.out.println(nums);

        //Remove methodunun içine tam sayı koyarsanız java onu indeks olarak kabul eder.
        //Note: Tüm tam sayılar Java için aksi söylenmedikçe primitive'dir, yani "int" dir
        //Note 2: "primitive" ler ArrayList'lerin elemanı olamazlar.
        //Note 3: "primitive" i "Wrapper Class" a çevirirseniz, non-primitive olur ve non-primitive ler ArrayList'lerin elemanı olur,
        // index olamaz.

        Integer sayi = 22;
        nums.remove(sayi);
        System.out.println(nums);








    }
}
