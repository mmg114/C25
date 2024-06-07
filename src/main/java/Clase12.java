import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Clase12 {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        System.out.println("_________________________________");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println("_________________________________");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("_________________________________");
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println( localTime.format(dateTimeFormatter));
        System.out.println("_________________________________");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("_________________________________");

//Hacer un programa que me diga mi edad.



    }
}
