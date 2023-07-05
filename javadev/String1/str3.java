package javadev.String1;

public class str3 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Java");
        s.append(" hello world");
        char ch[] = new char[] { 'H', 'e', 'l', 'l', 'o' };
        s.append(ch);
        s.append(new person("Oracle"));
        System.out.println(s);
        System.out.println((new person("Hello").toString()));
        System.out.println(s.append(true));
    }
}

class person {
    String name;

    person(String name) {
        this.name = name;
    }
}
