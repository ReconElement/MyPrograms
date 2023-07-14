package javadev.api;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class api1 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2023, 07, 10);
        LocalDate date3 = LocalDate.parse("2023-07-10");
        LocalDate date4 = LocalDate.of(2023, Month.JULY, 10);
        Scanner sc = new Scanner(System.in);
        System.out.println(date1);
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getDayOfYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getYear());
    }
}
