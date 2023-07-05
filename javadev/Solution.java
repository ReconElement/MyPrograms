package javadev;

import java.util.*;

public class Solution {
    public int reverse(int x) {
        int z = x;
        int rem, sum = 0;
        while (z != 0) {
            rem = z % 10;
            sum = sum * 10 + rem;
            z = z / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        System.out.println("Enter a number to get it's reverse: ");
        int num = sc.nextInt();
        System.out.println("The reverse of the number entered is: " + (obj.reverse(num)));
    }
}
