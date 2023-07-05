package javadev;

import java.util.Scanner;

public class rev_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev = "";
        System.out.println("Enter a string: ");
        String s = sc.next();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}