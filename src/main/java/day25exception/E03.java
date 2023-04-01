package day25exception;

public class E03 {


    public static void main(String[] args) {
        String str = "Ali";
        getNumOfChars(str);
        String str2 = "";
        getNumOfChars(str2);
        String t = null;
        getNumOfChars(t); //"NullPointerException" Eğer length methodunda null kullanırsanız bu exception' ı alırsınız




    }

    public static void getNumOfChars(String str){
        try{
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.err.println("length() methodununda bir problem olustu!");
        }



    }


}
