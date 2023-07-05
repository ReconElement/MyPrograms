package javadev;

import java.io.File;

public class deletefile {
    public static void main(String[] args) {
        File obj = new File("new.txt");
        if (obj.delete()) {
            System.out.println("Deleted file: " + (obj.getName()));
        } else {
            System.out.println("Deletion failed");
        }
    }
}
