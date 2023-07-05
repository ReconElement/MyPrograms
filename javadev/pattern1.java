package javadev;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to find whether the pattern defined exists in it or not: ");
        String sentence = sc.nextLine();
        Pattern pattern = Pattern.compile("Omkar Panda", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Pattern found");
        } else
            System.out.println("Pattern not found");
    }
}
