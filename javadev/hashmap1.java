package javadev;

import java.util.*;

public class hashmap1 {
    public static void main(String[] args) {
        HashMap<String, String> Capital = new HashMap<String, String>();
        Capital.put("India", "New Delhi");
        Capital.put("UK", "London");
        Capital.put("Italy", "Rome");
        Capital.put("France", "Paris");
        Capital.put("Germany", "Berlin");
        System.out.println(Capital);
        System.out.println(Capital.get("France"));
        Capital.remove("UK");
        System.out.println(Capital.size());
        Capital.clear();
        for (String i : Capital.values())
            System.out.println(i);
    }
}
