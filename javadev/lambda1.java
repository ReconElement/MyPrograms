package javadev;

import java.util.Scanner;

public class lambda1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Addable s = (a, b) -> a * b + 25;
        System.out.println(s.add(x, y));
    }
}
