package javaweek9homeworkharshitpatel;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_6_SpecificIndex {

    public static void main(String[] args) {
        specificIndex();
    }

    public static void specificIndex() {

        ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Honda");
        list_Strings.add("BMW");
        list_Strings.add("Toyota");
        list_Strings.add("Audi");
        list_Strings.add("Tesla");
        System.out.println(list_Strings);
        int a;
        Scanner scn = new Scanner(System.in);
        System.out.print("Please Enter number between 0 to 4 to identify elements at specific index: ");
        a = scn.nextInt();
        if (a < 0 || a > 4) {
            System.out.print("Index " + a + " is out of bounds");
        } else {
            String element = list_Strings.get(a);
            System.out.println("\nElement at index " + a + " is " + "\"" + element + "\"");
        }
        scn.close();
    }

}
