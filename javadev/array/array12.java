package javadev.array;

import java.util.ArrayList;

public class array12 {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<String>();
        String one = "One";
        String two = new String("Two");
        myArrList.add(one);
        myArrList.add(two);
        ArrayList<String> yourArrList = myArrList;
        one.replace("O", "B");
        for (String val : myArrList)
            System.out.print(val + ":");
        for (String val : yourArrList)
            System.out.print(val + ":");
    }
}
