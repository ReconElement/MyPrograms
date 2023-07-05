package javadev.array;

import java.util.*;

public class array7 {
    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<>();
        st.add("Hello");
        st.add("World");
        st.add(0, "Bye");
        st.add("String");
        ListIterator<String> it = st.listIterator();

    }
}
