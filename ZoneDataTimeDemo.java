// import java.time.LocalDate;
// import java.time.temporal.ChronoUnit;

// public class LocalDateDemo { 

//     public static void main(String[] args) {

//         LocalDate d1 = LocalDate.now();
//         System.out.println(d1);

//         LocalDate d2 = LocalDate.of(2012, 02, 13); 
//         System.out.println(d2); 

//         LocalDate d3 = LocalDate.parse("2018-05-19");
//         System.out.println(d3); 

//         System.out.println(d1.plusDays(1)); 
//         System.out.println(d1.minus(1, ChronoUnit.MONTHS)); 
//         System.out.println(d2.getDayOfWeek());
//         System.out.println(d3.getDayOfMonth());
//         System.out.println(d2.isLeapYear());
 
//         // Calculate age based on dob 
//         LocalDate dob = LocalDate.of(1990, 5, 15); // Example date of birth 
//         LocalDate today = LocalDate.now();

//         long years = ChronoUnit.YEARS.between(dob, today);
//         long months = ChronoUnit.MONTHS.between(dob, today);
//         long days = ChronoUnit.DAYS.between(dob, today);

//         System.out.println("Years: " + years);
//         System.out.println("Months: " + months);
//         System.out.println("Days: " + days);
        
//     }
// }




// Local time 
// import java.time.LocalTime;
// import java.time.temporal.ChronoUnit; 

// public class LocalTimeDemo { 

//     public static void main(String[] args) {

//         LocalTime t1 = LocalTime.now();
//         System.out.println(t1);

//         LocalTime t2 = LocalTime.of(14, 30, 15); 
//         System.out.println(t2); 

//         LocalTime t3 = LocalTime.parse("18:45:30");
//         System.out.println(t3);

//         System.out.println(t1.plusHours(2)); 
//         System.out.println(t1.minus(30, ChronoUnit.MINUTES));
//         System.out.println(t2.getSecond()); 
//         System.out.println(t3.getNano()); 
//     }
// }



// Time Zoned 

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ZoneDataTimeDemo {

    public static void main(String[] args) {
        TimeZone zone = TimeZone.getTimeZone("IST"); 

        Calendar cal = new GregorianCalendar(zone);

        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
