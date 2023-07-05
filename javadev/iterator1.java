package javadev;

import java.util.*;

public class iterator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Iterator<Integer> it = nums.iterator();
        System.out.println("Add numbers to your array: ");
        int x = sc.nextInt();
        nums.add(x);
        while (true) {
            System.out.println("Do you want to add more elements into your array: ");
            char ch = sc.next().charAt(0);
            if (ch == 'y') {
                int Add = sc.nextInt();
                nums.add(Add);
            }
            if (ch == 'n')
                break;
        }
        try {
            while (it.hasNext()) {
                Integer i = it.next();
                if (i < 200)
                    it.remove();
            }
        } catch (Exception e) {
            System.out.println("Oops! Something went wrong.");
        } finally {
            System.out.println("The try catch is finished");
        }
        System.out.println(nums);
        throw new ArithmeticException("Access denied");
    }

}
