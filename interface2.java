public class interface2 implements interface1 {
    public void hello() {
        System.out.println("Hello World");
    }

    public void bye() {
        System.out.println("Bye, have a nice day");
    }

    public static void main(String[] args) {
        interface2 obj = new interface2();
        obj.hello();
        obj.bye();
    }
}
