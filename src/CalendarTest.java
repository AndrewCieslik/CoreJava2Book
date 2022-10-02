import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;

public class CalendarTest {
    public static void main(String[] args){
        //d - first day of month
        GregorianCalendar d = new GregorianCalendar();
        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);
        System.out.println("Today: " + today);
        System.out.println("Month: " + month);

        //change d to first day of month
        d.set(Calendar.DAY_OF_MONTH,1);

        int dayOfWeek = d.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of week: " + dayOfWeek);
        System.out.println("Su Mo Tu We Thu Fr Sa");

        //fill empty spaces
        for(int i = Calendar.SUNDAY; i < dayOfWeek; i++){
            System.out.print("   ");
        }

        do{
            //print day
            int day = d.get(Calendar.DAY_OF_MONTH);
            if(day < 10) {
                System.out.print(" ");
            }
            System.out.print(day);

            //add * to today day
            if(day == today){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            //new line after every Saturday
            if(dayOfWeek == Calendar.SATURDAY){
                System.out.println();
            }
            // move d to the next day
            d.add(Calendar.DAY_OF_MONTH, 1);
            dayOfWeek = d.get(Calendar.DAY_OF_WEEK);

            //stop when d == first day of next month
        } while (d.get(Calendar.MONTH) == month);

        if(dayOfWeek != Calendar.SUNDAY){
            System.out.println();
        }
    }
}


