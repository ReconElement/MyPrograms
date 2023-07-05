package javadev.array;

import java.util.*;

public class array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StringBuilder> s1 = new ArrayList<StringBuilder>();
        int i = 0;
        while (true) {
            System.out.println("Enter the element you want in your array list of strings(n to stop): ");
            String sm = sc.nextLine();
            StringBuilder st = new StringBuilder(sm);
            if (st.charAt(0) == 'n')
                break;
            else
                i++;
            s1.add(st.append("\t" + i));
        }
        ListIterator it = s1.listIterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("The size of the arraylist is " + (s1.size()));
        System.out.println("Enter element to search: ");
        String sp = sc.nextLine();
        StringBuilder str = new StringBuilder(sp);
        if (s1.contains(str))
            System.out.println("The arraylist has the element " + str + " at the index of " + s1.indexOf(str));
    }
}
