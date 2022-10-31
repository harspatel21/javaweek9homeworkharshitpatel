package javaweek9homeworkharshitpatel;
// 3. Write a Java program to reverse an array of integer values

public class Programme_3_ReverseOfArrays {
    public static void main(String[] args) {
        reverseOfArray();
    }

    public static void reverseOfArray() {
        Integer[] anArray = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        System.out.println("Original Arrays : ");
        for (int i = 0; i < anArray.length; i++) {
            System.out.print(anArray[i] + " ");
        }
        System.out.println(" \n");
        System.out.println("======================================================");
        System.out.println("Arrays in Reverse Order : ");
        for (int i = anArray.length - 1; i >= 0; i--) {
            System.out.print(anArray[i] + " ");

        }
    }

}