import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Poggy");
        al.add("Beebeep");
        al.add("Shieet");
        Iterator<String> itr = al.iterator();
    }
}
