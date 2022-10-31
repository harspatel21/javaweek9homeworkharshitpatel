package javaweek9homeworkharshitpatel;

import java.util.ArrayList;

public class Programme_7_IsEmptyList {
    public static void main(String[] args) {
        isUndergroundList();
    }

    public static void isUndergroundList() {
        ArrayList<String> underGroundTrains = new ArrayList<>();

        System.out.println("Original Array List: " + underGroundTrains);
        if (underGroundTrains.isEmpty()) {
            System.out.println("Array List is empty");
        }
        // System.out.println("Check if the above array list is empty or not! "+underGroundTrains.isEmpty());


        underGroundTrains.add("Bakerloo Line");
        underGroundTrains.add("Jubilee Line");
        underGroundTrains.add("Metropolitan Line");
        underGroundTrains.add("Victoria Line");
        underGroundTrains.add("Northern Line");
        underGroundTrains.add("Central Line");
        underGroundTrains.add("DLR Line");
        underGroundTrains.add("Over Ground");
        underGroundTrains.add("District Line");
        underGroundTrains.add("Elizabeth Line");
        underGroundTrains.add("Central Line");

        System.out.println("\nUdated ArrayList: " + underGroundTrains);
        System.out.println("Array List is not empty");

    }
}
