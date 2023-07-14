package javadev.api;

import java.time.*;

public class api5 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2023, 12, 02);
        System.out.println(d1.withDayOfMonth(12));
        System.out.println(d1.withDayOfYear(11));
        System.out.println(d1.withMonth(5));
        System.out.println(d1.withYear(1982));
        System.out.println();
        System.out.println();

    }
}
