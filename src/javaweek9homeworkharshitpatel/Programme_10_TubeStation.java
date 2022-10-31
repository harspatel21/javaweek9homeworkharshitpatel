package javaweek9homeworkharshitpatel;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_10_TubeStation {
    public static void bakerStreet() {
        ArrayList<String> bakerstreet = new ArrayList();
        bakerstreet.add("Bakerloo");
        bakerstreet.add("Jubilee");
        bakerstreet.add("Metropolitan");
        for (String station : bakerstreet) {
            System.out.println("Baker Street Station Serves : " + station + " Line");
        }
    }

    public static void greenpark() {
        ArrayList<String> greenpark = new ArrayList();
        greenpark.add("Victoria");
        greenpark.add("Jubilee");
        greenpark.add("Piccadilly");
        for (String station : greenpark) {
            System.out.println("Green Park Station Serves : " + station + " Line");
        }
    }

    public static void westminster() {

        ArrayList<String> westminster = new ArrayList();
        westminster.add("District");
        westminster.add("Circle");
        westminster.add("Jubilee");

        for (String station : westminster) {
            System.out.println("Westminster Station Serves : " + station + " Line");
        }
    }

    public static void oxfordCircus() {

        ArrayList<String> oxfordCircus = new ArrayList();
        oxfordCircus.add("Bakerloo");
        oxfordCircus.add("Central");
        oxfordCircus.add("Victoria");

        for (String station : oxfordCircus) {
            System.out.println("Oxford Circus Station Serves : " + station + " Line");
        }
    }

    public static void bank() {

        ArrayList<String> bank = new ArrayList();
        bank.add("Northern");
        bank.add("DLR");
        bank.add("Central");
        bank.add("Waterloo and City");

        for (String station : bank) {
            System.out.println("Bank Station Serves : " + station + " Line");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("\n****** Zone 1 stations: Bank, Baker Street, Oxford Circus, Green Park, Westminster ******");
        System.out.println("\nPlease enter station name from the list to find which line serves that station: ");
        String stn = scn.nextLine().toLowerCase();
        System.out.println("");
        scn.close();
        switch (stn) {
            case "baker street":
                bakerStreet();
                break;
            case "bank":
                bank();
                break;
            case "oxford circus":
                oxfordCircus();
                break;
            case "westminster":
                westminster();
                break;
            case "green park":
                greenpark();
                break;
            default:
                System.out.println("You have entered an invalid station name");
                break;
        }
    }
}