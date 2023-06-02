import java.util.*;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = (a < b) ? a : b;
        System.out.println("The smaller number between the two is: " + min);
    }
}