package javadev.String1;

public class str1 {
    public static void main(String[] args) {
        String hello = "hello";
        System.out.println(hello.indexOf('l', 3));
        System.out.println(hello.indexOf('a'));
        String x = new String("hello");
        System.out.println(x.equals(hello));
        System.out.println(x == hello);
    }
}
