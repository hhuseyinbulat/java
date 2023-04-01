package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1 : "Anlık tarihi" (Current Date) Ekrana yazdıran kodu yazınız
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); //2022-10-21

        //Example 2 : "Anlık zamanı"
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); //20:42:17.474743200

        //
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T20:45:13.532510600

        //Japonyada anlık tarih ve anlık zaman
        LocalDateTime LocalDateTimeinjapan= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(LocalDateTimeinjapan);

        // Example Bugünden 789 gün sonra emekli olacagınıza göre emeklilik tarihini hesaplayan kodu yazınız
        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);

        // İki cocugunuzun dogum tarihleri arasındaki farkı gün olarak hesaplayan kodu yazınız
        LocalDate dateOfBirthAli=LocalDate.of(2005,5,17);
        LocalDate dateOfBirthVeli=LocalDate.of(2013,2,8);

        // Between methodunda daha eski tarih önce yazılmalıdır.
        Long diff= ChronoUnit.DAYS.between(dateOfBirthAli,dateOfBirthVeli);
        System.out.println(diff); //2824

        //Example: İstanbulun fethi ile cumhuruiyetin kurulması arasında kaç ay oldugunu gösteren

        LocalDate cumhuriyet = LocalDate.of(1923,10,29);
        LocalDate fetih = LocalDate.of(1453,5,29);

        Long fetihcumhuriyet = ChronoUnit.MONTHS.between(fetih,cumhuriyet);
        System.out.println(fetihcumhuriyet);

        //Example: Verilen tarihin hangi burçta oldugunu gösteren kodu yazınız
        LocalDate myDate=LocalDate.of(1989,4,12);
        int day = myDate.getDayOfMonth(); // bir tarihten gün alma
        int mounth = myDate.getMonthValue();// bir tarihten ay alma


            if ((day>=21 && mounth==3)||(day<=20 && mounth==4)){
                System.out.println("koç");
            } else if ((day>=21 && mounth==4)||(day<20 && mounth==5)) {
                System.out.println("boğa");
            }else if ((day>=21 && mounth==4)||(day<20 && mounth==5)) {
                System.out.println("boğa");
            }else if ((day>=21 && mounth==4)||(day<20 && mounth==5)) {
                System.out.println("boğa");
            }else if ((day>=21 && mounth==4)||(day<20 && mounth==5)) {
                System.out.println("boğa");
            }else if ((day>=21 && mounth==4)||(day<20 && mounth==5)) {
                System.out.println("boğa");
            }else if ((day>=21 && mounth==4)||(day<20 && mounth==5)) {
                System.out.println("boğa");
            }else if ((day>=21 && mounth==4)||(day<20 && mounth==5)) {
                System.out.println("boğa");
            }else if ((day>=21 && mounth==4)||(day<20 && mounth==5)) {
                System.out.println("boğa");
            }else if ((day>=21 && mounth==4)||(day<20 && mounth==5)) {
                System.out.println("boğa");
            }else if ((day>=21 && mounth==4)||(day<20 && mounth==5)) {
                System.out.println("boğa");
            }


    }
}
