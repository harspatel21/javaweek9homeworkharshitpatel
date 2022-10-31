package javaweek9homeworkharshitpatel;

import java.util.ArrayList;

/*4. Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.*/

public class Programme_4_ArrayColour {

    public static void main(String[] args) {
        Programme_4_ArrayColour obj = new Programme_4_ArrayColour();
        obj.getColours();
    }

    public void getColours() {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("violet");
        colours.add("Yellow");
        colours.add("Purple");
        colours.add("White");
        colours.add("Black");
        colours.add("Blue");
        colours.add("Red");

        System.out.println("These are the colours of the life");
        for (String colrs : colours) {
            System.out.println(colrs);
        }
    }
}
