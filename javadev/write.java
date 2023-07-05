package javadev;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class write {
    public static void main(String[] args) {
        try {
            FileWriter item = new FileWriter("new.txt");
            item.write("I'm writing into a notepad text document using Java programming language. ");
            item.close();
            System.out.println("File successfully edited");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
