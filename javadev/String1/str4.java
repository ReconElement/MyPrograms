package javadev.String1;

public class str4 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello World");
        s.insert(5, "Java");
        s.insert(5, ' ');
        System.out.println(s);
        char name[] = new char[] { 'J', 'a', 'v', 'a' };
        s.insert(0, name, 0, 4);
        System.out.println(s);
    }
}
