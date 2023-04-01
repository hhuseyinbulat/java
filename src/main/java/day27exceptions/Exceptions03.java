package day27exceptions;

public class Exceptions03 {


    public static void main(String[] args) throws IllegalGradeException {

         printGrades(80);
         checkNameFormat("veli");

    }
    public static void printGrades(double grade) throws IllegalGradeException {
        if (grade < 0 || grade > 100) {
            throw new IllegalGradeException("Grade 0 dan az 100den cok olamaz");
        } else {
            System.out.println(grade);

        }
    }

    public static boolean checkNameFormat(String name){
        if (name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        }else{
            throw new IllıgalNameException("ısımler buyuk harfle baslamalıdır");
        }
    }


}
