package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
//0 - 4 => bebek
//5 - 12 => cocuk
//13 - 20 => genc
//21 - 30 => yetiskin
//Tanimlanmamis evre


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        byte yas = input.nextByte();
        if (yas<0){
            System.out.println("Geçerli yaş giriniz");}
        else if (yas<5) {
            System.out.println("bebek");}
        else if (yas<13) {
            System.out.println("Çocuk");}
        else if (yas<21) {
            System.out.println("Genç");}
        else if (yas<31) {
            System.out.println("Yetişkin");}
        else{
            System.out.println("Tanımlanmamış evre");}

        }

    }



