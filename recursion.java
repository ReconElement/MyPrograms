import java.util.*;

public class recursion {
    public static int Sum(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to get their sum: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Their sum is " + Sum(x, y));
    }
}