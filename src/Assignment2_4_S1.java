import java.util.*;

/**
 * Assignment 2, task 4, solution 1:
 * Because of the vague description and our interpretation of this task,
 * we chose to have some liberties. Example of this is a HashMap where
 * the keys are defined as names, this could lead to problem further
 * down if there was a person with the same name. Another example is
 * using Java Streams to write less and cleaner code.
 * */

public class Assignment2_4_S1 {
    public static void main(String[] args) {
        HashMap<String, Integer> priorityQueue = new HashMap<>();
        add_element("Terje", 5, priorityQueue);
        add_element("Kari", 7, priorityQueue);
        add_element("Nils", 4, priorityQueue);
        add_element("Otto", 8, priorityQueue);
        add_element("Syvert", 7, priorityQueue);
        add_element("Lise", 11, priorityQueue);
        add_element("Notto", 0, priorityQueue);
        add_element("Odd", 1, priorityQueue);
        add_element("Even", 2, priorityQueue);
        get_highest_priority_element(priorityQueue);
        print_all_elements_in_order(priorityQueue);
    }
    public static boolean add_element(String name, int priority, HashMap<String, Integer> priorityQueue) {
        if (priorityQueue.containsValue(priority)) {
            System.out.println("False, the duplicate value is: " + priority);
            return false;
        } else if (priorityQueue.isEmpty()) {
            priorityQueue.put(name, priority);
        }  else {
            System.out.println("True");
            priorityQueue.put(name, priority);
        } return true;
    }
    public static boolean get_highest_priority_element(HashMap<String, Integer> priorityQueue) {
        int max = priorityQueue
                .values()
                    .stream()
                        .max(Integer::compare)
                            .get();
        System.out.println("\nThe highest value in the priority is: " + max + "\n");
        return true;
    }
    public static boolean print_all_elements_in_order(HashMap<String, Integer> priorityQueue) {
        priorityQueue
                .entrySet()
                    .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                            .forEach(System.out::println);
        return true;
    }
}

