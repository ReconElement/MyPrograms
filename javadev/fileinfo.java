package javadev;

import java.io.File;

public class fileinfo {
    public static void main(String[] args) {
        File obj = new File("new.txt");
        if (obj.exists()) {
            System.out.println("File name: " + (obj.getName()));
            System.out.println("Absolute path: " + (obj.getAbsolutePath()));
            System.out.println("Writeable: " + (obj.canWrite()));
            System.out.println("Readable: " + (obj.canRead()));
            System.out.println("File size in bytes: " + (obj.length()));
        } else {
            System.out.println("File not found");
        }
    }
}
