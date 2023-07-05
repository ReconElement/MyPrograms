package javadev;

import java.util.Scanner;

public class lambda3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        Say person = (name) -> {
            String s1 = "The name is ";
            String s2 = s1 + name;
            return s2;
        };
        System.out.println(person.speak(name));
    }
}
