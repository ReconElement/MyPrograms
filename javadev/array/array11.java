package javadev.array;

import java.util.ArrayList;

public class array11 {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        s1.add("Hello");
        s1.add("World");
        s2.add("I am ");
        s2.add("Omkar");
        s1.addAll(2, s2);
        for (String i : s1)
            System.out.println(i);
        if (s1.contains("Hello"))
            System.out.println("True");
        ArrayList<String> cpy = (ArrayList<String>) s1.clone();
        for (String i : s1)
            System.out.println(i);
        Object arr[] = s1.toArray();
        for (Object i : arr)
            System.out.println(i);

    }
}
