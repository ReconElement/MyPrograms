public class alpha {
    public void hello() {
        System.out.println("Hello World this is from a public function");
    }

    static void bye() {
        System.out.println("Hello world this is from a static function");
    }

    public static void main(String[] args) {
        alpha obj = new alpha();
        obj.hello();
        bye();
    }
}
