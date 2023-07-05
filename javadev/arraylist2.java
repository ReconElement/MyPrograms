package javadev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to add an element to your array(y/n): ");
            String st = sc.next();
            char ch = st.charAt(0);
            if (ch == 'y') {
                System.out.println("Enter the integer: ");
                int n = sc.nextInt();
                num.add(n);
            }
            if (ch == 'n') {
                System.out.println("The elements of the array are: ");
                for (int i : num) {
                    System.out.println(i);
                }
                Collections.sort(num);
                break;
            }
        }
    }
}
