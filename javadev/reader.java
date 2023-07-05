package javadev;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class reader {
    public static void main(String[] args) {
        try {
            File item = new File("new.txt");
            Scanner sc = new Scanner(item);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
