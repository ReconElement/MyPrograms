public class fun {
    public static void myGame() {
        System.out.println("This is my game");
    }

    public void mySecretGame() {
        System.out.println("This is my secret game");
    }

    public static void main(String[] args) {
        myGame();
        fun obj = new fun();
        obj.mySecretGame();
    }
}