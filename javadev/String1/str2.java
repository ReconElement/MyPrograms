package javadev.String1;

public class str2 {
    public static void main(String[] args) {
        String a = "Hello World";
        String sub = a.substring(1, 8);
        System.out.println(sub);
        String sub1 = a.substring(4);
        System.out.println(sub1);
        a = "     " + a + "     ";
        System.out.println(a);
        System.out.println(a.trim());
        System.out.println(a.replace("Hello", "Bye").trim());
        System.out.println(a.length());
        System.out.println(a.trim().length());
        a = a.trim();
        System.out.println(a.startsWith("H", 0));
        System.out.println(a.endsWith("World"));
        String lang = "Java";
        lang += " is everywhere!";
        String initializedToNull = null;
        initializedToNull += "Java";
        System.out.println(initializedToNull);
    }
}
