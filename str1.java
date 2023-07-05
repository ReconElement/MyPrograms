public class str1 {
    public static void main(String[] args) {
        String s = new String("Hello");
        String s1 = new String("Hello");
        System.out.println(s == s1);
        String s2 = "Hello";
        String s3 = "Hello";
        System.out.println(s2 == "Hello");
        char hello[] = new char[] { 'h', 'e', 'l', 'l', 'o' };
        String s4 = new String(hello);
        System.out.println(s4);
        StringBuilder s5 = new StringBuilder("Hello");
        String s6 = new String(s5);
        System.out.println(s6);
    }
}
