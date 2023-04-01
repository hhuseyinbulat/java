package day26exceptions;

public class Exception04 {
    public static void main(String[] args) {

       try {
           printAge(-5);
       }catch (IllegalArgumentException e ){
       e.getMessage();}
    }

    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Yas negatif olamaz");
        }
        System.out.println(age);
    }
}
