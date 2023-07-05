package javadev.String1;

import java.util.*;

public class str6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to get it's reverse: ");
        String s = sc.nextLine();
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        System.out.println(s1);
    }
}
