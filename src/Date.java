import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    public static void main(String[] args){
        DateTimeFormatter dtfStandard = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtfStandard.format(now));

        DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime localTime = LocalDateTime.now();
        System.out.println(dtfTime.format(localTime));

        GregorianCalendar dateWhenCreated = new GregorianCalendar();

        GregorianCalendar newYearsDay = new GregorianCalendar(2023,11,31);  //(month 0-11)
        System.out.println(newYearsDay.getTime());

        GregorianCalendar firstDayOfTheYear = new GregorianCalendar();
        firstDayOfTheYear = newYearsDay;
        firstDayOfTheYear.add(Calendar.DAY_OF_YEAR,1);
        System.out.println(firstDayOfTheYear.getTime());
    }
}
