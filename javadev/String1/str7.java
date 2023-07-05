package javadev.String1;

public class str7 {
    public static void main(String[] args) {
        String s1 = new String("Hello World");
        StringBuilder s2 = new StringBuilder("Hello World");
        System.out.println(s1.replace("World", "Baby"));
        s2.replace(6, 11, "Baby");
        System.out.println(s2);
        System.out.println(s2.subSequence(0, 5));
        System.out.println(s2.substring(0, 5));
    }
}
