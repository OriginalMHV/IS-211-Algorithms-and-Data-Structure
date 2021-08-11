import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Assignment 2 Task 2C:
 * With the approach bellow, we chose to show two different ways of completing the task
 * The first method uses list because of Java 8 Streams, and the second method uses array
 * because of algorithmic implementation.
 * */

public class Assignment2_2C {
    public static void main(String[] args) {
        findHighLowStreams();
        findHighLowAlgorithm();
    }

    public static void findHighLowStreams() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 4, 2, 7, 6, -3, -1, -2, 42, 0,
                -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3);
        System.out.println(list);

        Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("This was found by using Java Streams");
        System.out.println("The max value of the list is: " + max);
        System.out.println("The min value of the list is: " + min);
    }

    public static void findHighLowAlgorithm() {
        int[] arr = {4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};
        int max = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
            }
        int min = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min) {
                min = arr[i];
            }
        System.out.println("This was found by using algorithm");
        System.out.println("The max value of the list: " + max);
        System.out.println("The max value of the list: " + min);
    }
}