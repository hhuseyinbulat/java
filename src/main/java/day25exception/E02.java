package day25exception;

public class E02 {


    public static void main(String[] args) {
        String arr[] = {"Ali","Veli","hasan","Cennet"};
        getElementFromArray(arr,4);

    }
    public static void getElementFromArray(String[] arr,int idx){
        try{
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Lütfen belirtilen indekste bir sayı giriniz");
        }

    }


}
