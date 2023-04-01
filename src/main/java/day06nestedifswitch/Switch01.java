package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Kullanıcıdan gün sayısını alınız ve gün ismini ekrana yazdırınız:

        Scanner input = new Scanner(System.in);
        System.out.println("Gün nosunu giriniz");
        byte gunNo = input.nextByte();

        // 1. Yol if ile

        if (gunNo==1){
            System.out.println("pazar");}
        else if (gunNo==2){
            System.out.println("pazartesi");}
        else if (gunNo==3){
            System.out.println("salı");}
        else if (gunNo==4){
            System.out.println("çarşamba");}
        else if (gunNo==5){
            System.out.println("perşembe");}
        else if (gunNo==6){
            System.out.println("cuma");}
        else if (gunNo==7){
            System.out.println("cumartesi");}
        else{
            System.out.println("Geçerli bir gün no giriniz");}

        // 2.yol switch ile:

        switch (gunNo){
            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("pazartesi");
                break;
            case 3:
                System.out.println("salı");
                break;
            case 4:
                System.out.println("carsamba");
                break;
            case 5:
                System.out.println("perşembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("Geçerli gün sayısı giriniz");
        }






    }

    }

