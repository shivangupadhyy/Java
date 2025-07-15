package Advance_Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class java_Time {
    public static void main(String[] args) {
        // LocalDate d  = LocalDate.now();
        // System.out.println(d);

        // LocalTime t = LocalTime.now();
        // System.out.println(t);
        // LocalDateTime dt = LocalDateTime.now();
        // System.out.println(dt);
        LocalDateTime dt = LocalDateTime.now();//This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy --E H:m a");// This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String Mydate = dt.format(df);// Creating date String using date and format
        System.out.println(Mydate);
    }
}
