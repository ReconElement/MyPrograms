package javadev;

import java.util.Scanner;

public class palindrome_string {
    public String longestPalindrome(String s) {
        String palindrome = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    palindrome = s.substring(i, j + 1);
                }
            }
        }
        return palindrome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to get it's palindromic substring: ");
        String s = sc.next();
        palindrome_string obj = new palindrome_string();
        System.out.println(obj.longestPalindrome(s));
    }
}
