package Advance_Java;

import java.sql.Date;

public class Date_time {
    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());
        Date d = new Date(0);
        System.out.println(d);
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getYear());
    }  
}