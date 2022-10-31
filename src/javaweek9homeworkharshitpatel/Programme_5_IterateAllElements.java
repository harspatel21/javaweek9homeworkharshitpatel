package javaweek9homeworkharshitpatel;

import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5_IterateAllElements {

    public void arrayListelement() {
        ArrayList<String> element = new ArrayList<String>();
        element.add("Wood");
        element.add("Metal");
        element.add("Water");
        element.add("Fire");
        element.add("Air");
        element.add("Earth");
        Iterator itr = element.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        Programme_5_IterateAllElements ele = new Programme_5_IterateAllElements();
        ele.arrayListelement();
    }
}


