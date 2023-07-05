package javadev;

import java.util.HashSet;
import java.util.Scanner;

public class hashset1 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to add a name to your hashset (y/n): ");
            char ch = sc.next().charAt(0);
            if (ch == 'y') {
                System.out.println("");
                String s = sc.nextLine();
                names.add(s);
            }
            if (ch == 'n') {
                System.out.println("");
                for (String i : names)
                    System.out.println(i);
                System.out.println(names.size());
                break;
            }
        }
    }
}
