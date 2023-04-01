package day26exceptions;

public class Exceptions02 {
    public static void main(String[] args) {

        char ch1 = getCharFromString("Java",2);
        System.out.println(ch1);

        char ch2 = getCharFromString("selenium",8);
        System.out.println(ch2);


    }

    public static char getCharFromString(String str, int idx){
        char ch = ' ';
        try{

            ch = str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("İndeks ile ilgili bir problem oluştu: "+ e.getMessage());
            e.printStackTrace();
        }

        return ch;
    }

}
