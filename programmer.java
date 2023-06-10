public class programmer extends employee {
    int bonus = 900;

    public static void main(String[] args) {
        programmer obj = new programmer();
        System.out.println("Salary of the employee is: " + obj.salary);
        System.out.println("Bonus of the employee is: " + obj.bonus);
    }
}
