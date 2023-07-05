import java.util.*;

public class Solution {
    public void romanToInt(String s) {
        int len = s.length();
        int val = 0, x;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'I')
                val = 1 + val;
            if (s.charAt(i) == 'V')
                val = 5 + val;
            if (s.charAt(i) == 'X')
                val = 10 + val;
            if (s.charAt(i) == 'L')
                val = 50 + val;
            if (s.charAt(i) == 'C')
                val = 100 + val;
            if (s.charAt(i) == 'D')
                val = 500 + val;
            if (s.charAt(i) == 'M')
                val = 1000 + val;
        }
        System.out.println("The value of the entered roman numerals in decimal numbers is: " + val);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.next();
        Solution obj = new Solution();
        obj.romanToInt(roman);
    }
}
