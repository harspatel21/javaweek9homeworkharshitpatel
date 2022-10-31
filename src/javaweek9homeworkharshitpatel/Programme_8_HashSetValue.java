package javaweek9homeworkharshitpatel;

import java.util.HashSet;

public class Programme_8_HashSetValue {

    public static void hasSetValue() {

        HashSet<Integer> number = new HashSet();

        number.add(4);
        number.add(7);
        number.add(8);
        number.add(12);
        number.add(24);

        for (int i = 1; i <= 10; i++) {
            if (number.contains(i)) {
                System.out.println(i + " is FOUND in the set.");
            } else {
                System.out.println(i + " is not found in the set.");
            }
        }
    }

    public static void main(String[] args) {
        hasSetValue();

    }
}