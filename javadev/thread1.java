package javadev;

public class thread1 implements Runnable {
    public void run() {
        System.out.println("This method is running in a thread");
    }

    public static void main(String[] args) {
        thread1 obj = new thread1();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This is running outside a thread");
    }
}