package Advance_Java;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Practice_set {
    public static void main(String[] args) {
        // ps q1

        ArrayList<String> ar = new ArrayList<>();
        ar.add("Shivang");
        ar.add("Ayushi");
        ar.add("Prabhat");
        ar.add("ABHishek");
        ar.add("SID");
        ar.add("Sohini");
        ar.add("Ansh");
        ar.add("Varun");
        ar.add("Vaibhav");
        ar.add("Ram");
        for (String o : ar) {
            System.out.println(o);
        }

        // PS q1

        // LocalTime t = LocalTime.now();
        // System.out.println(t);
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        // ps q3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        LocalTime t = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myTime = t.format(df);
        System.out.println(myTime);

        // ps q5
        HashSet<Integer> s = new HashSet<>();
        s.add(6);
        s.add(5);
        s.add(7);
        s.add(1);
        s.add(8);
        s.add(9);
        s.add(10);
        System.out.println(s);

    }
}
