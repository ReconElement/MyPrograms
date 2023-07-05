package javadev;

import java.util.*;

public class lambda2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Omkar");
        names.add("Poggy");
        names.add("Artillery");
        names.forEach((n) -> System.out.println(n));
    }
}
