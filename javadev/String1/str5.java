package javadev.String1;

public class str5 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("0123456789");
        s.deleteCharAt(0);
        System.out.println(s);
        s.delete(0, 7);
        System.out.println(s);
    }
}
