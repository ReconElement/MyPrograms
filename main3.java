import java.util.Scanner;

public class main3 {
    public static void name(String name) {
        System.out.println("The name is " + name);
    }

    public void bye(String name) {
        System.out.println("Bye " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        name(name);
        main3 obj = new main3();
        obj.bye(name);
    }
}
