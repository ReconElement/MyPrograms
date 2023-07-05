package javadev;

import java.io.IOException;
import java.io.File;

public class file {
    public static void main(String[] args) {
        try {
            File Obj = new File("new.txt");
            if (Obj.createNewFile()) {
                System.out.println("File created: " + (Obj.getName()));
            } else
                System.out.println("File already exists.");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
