class Phone {
    String phoneNumber = "123456789";

    String setNumber() {
        String phoneNumber;
        phoneNumber = "987654321";
        return phoneNumber;
    }
}

public class accessor {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        System.out.println(p1.setNumber());
        System.out.println(p1.phoneNumber);
    }
}
