package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {
        //Example: Japonya ile almanya arasındaki zaman farkını hesaplayan kodu yazınız:
        LocalDateTime injapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime inGerman = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long a =ChronoUnit.HOURS.between(inGerman,injapan); //İki tarihin arasındaki farkı görmek için
        System.out.println(a);


        //Example 2 : Sabit bir tarih olusturunuz
        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate);

        // Javada sabit dataları depolamak ve gerektiğinde kullanmak için  depolar olustururuz.
        // Bu depolara "Enum" denir.

        //Example 3: USA icin "Woow!", UK icin "Big", CANADA icin "Cold",
        //           TURKEY icin "Vatan", GERMANY icin "Araba", RWANDA icin "Cay"
       Countries country = Countries.USA;






    }
}
