package javadev;

import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mercedes");
        cars.add("Porsche");
        cars.add("Ferrari");
        for (int i = 0; i < cars.size(); i++)
            System.out.println(cars.get(i));
        for (String i : cars)
            System.out.println(i);
        System.out.println(cars);
        System.out.println(cars.get(2));
        cars.set(2, "Tank");
        System.out.println(cars.size());
        cars.remove(0);
        cars.clear();
    }
}
