package javadev.api;

import java.time.*;

public class api2 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2023, 07, 04);
        System.out.println(date1.plusDays(2));
        System.out.println(date1.minusYears(30));
        System.out.println(date2.plusYears(2));
    }
}
