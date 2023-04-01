package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        // Example 1 : Javadan aldıgınız date'i ay/gün/yıl olarak yazılır.

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); //2022-10-21

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = dtf1.format(currentDate);
        System.out.println(formattedDate1); //10/21/2022


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate3);

        //Example 2 : Javadan aldıgınız time in formatını degistiriniz

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime); //16:23:54.000002345

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");//Büyük H 24 sistemini küçük h 12 saatsistemini kullanır.
        String formattedMyTime = dtf7.format(myTime);
        System.out.println(formattedMyTime);

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println(formattedMyTime2);

    }
}
