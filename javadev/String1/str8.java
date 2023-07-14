package javadev.String1;

public class str8 {
    public static String lengthOfLongestSubstring(String s) {
        String sub = "";
        char arr[] = new char[] {};
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[j] != s.charAt(i)) {
                    sub = sub + s.charAt(i);
                    arr[i] = s.charAt(i);
                }
                if (arr[j] == s.charAt(i)) {
                    break;
                }
            }
        }
        return sub;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("madam"));
    }
}
