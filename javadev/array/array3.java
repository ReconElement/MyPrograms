package javadev.array;

public class array3 {
    public static void main(String[] args) {
        String names[] = new String[] { "John", "Mark", "Tony", "Mare" };
        String name[] = { "John", "Mark", "Tony", "Mare" };
        for (String i : name) {
            System.out.println(i);
        }
        for (String x : names)
            System.out.println(x);
    }
}
