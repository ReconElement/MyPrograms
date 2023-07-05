package javadev.array;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the element you want in your array list of strings(n to stop): ");
            String st = sc.nextLine();
            if (st.charAt(0) == 'n')
                break;
            else
                s1.add(st);
        }
        ListIterator<String> it = s1.listIterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
