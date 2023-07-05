package javadev.array;

import java.util.*;

public class array9 {
    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<String>();
        st.add("One");
        st.add("Two");
        st.add("Three");
        st.add("Four");
        st.add("Five");
        st.set(1, "One and a half");
        ListIterator it = st.listIterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println(st.get(0) + " " + st.size() + " " + st.contains("Three") + " " + st.indexOf("Three"));

    }
}
