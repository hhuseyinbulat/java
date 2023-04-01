package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        // Example 1: Kullanıcıdan alınan sayının tek mi çift mi oldugunu ekrana yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int s = input.nextInt();
        if(s%2==0){
            System.out.println("Çift Sayı");
        }
        if(s%2!=0){
            System.out.println("Tek Sayı");
        }

         //2: yol:

        if (s%2==0){
            System.out.println("Çift sayı");

        }else{
            System.out.println("Tek sayı");

        }

        //example 2: Bir sayının negatif pozitif veya nötr olduğunu söyleyen prog yazınız

        System.out.println(" bir sayı giriniz");
        double d = input.nextDouble();
        if(d>0){
            System.out.println("Pozitif");
        }else if(d==0){
            System.out.println("nötr");
        }else{
            System.out.println("Negatif");
        }




    }
}
