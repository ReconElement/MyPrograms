import java.util.*;

public class word {
    static void myProfile(String name, int age) {
        System.out.println("My name is " + name + ", my age is " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your names and ages: ");
        String names[5];
        int age = 0;
        for (int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
            age = sc.nextInt();
            myProfile(names[i], age);
            age = 0;
        }
    }
}
