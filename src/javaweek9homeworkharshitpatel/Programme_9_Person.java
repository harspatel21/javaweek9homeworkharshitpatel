package javaweek9homeworkharshitpatel;

import java.util.*;

public class Programme_9_Person {
    public static void main(String[] args) {
        Programme_9_Person obj = new Programme_9_Person();
        obj.people();
    }

    public void people() {
        Map<String, Integer> people = new HashMap<String, Integer>();
        people.put("Raj ", 18);
        people.put("Mitul ", 23);
        people.put("Darshan", 32);
        people.put("Bhavesh", 45);
        people.put("Bargav", 50);


        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(value + " = " + key);
        }

    }


}

