package day16multidimensinolarraysarraylists;

public class MultidimensinolArrays02 {
    public static void main(String[] args) {
        //Bir MultidimensinolArray deki en büyük ve en küçük elemanın toplamını veren kodu yazınız

        int arr[][] = {{2, 5, 1}, {83, 75}};

        int max = arr[0][0];
        int min = arr[0][1];

        for (int[] w : arr) {
            for (int k : w) {
                max = Math.max(max, k);
                min = Math.min(min, k);
            }

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(max + min);


    }
}
