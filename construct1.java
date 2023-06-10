import java.util.*;

public class construct1 {
    int x;

    public construct1(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        construct1 obj = new construct1(num);
        System.out.println(obj.x);
    }
}
