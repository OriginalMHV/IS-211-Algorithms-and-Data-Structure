/**
 * Assignment 2, task 4, solution 2:
 * In this solution we're instead using a linked list.
 * This solution utilizes the extra class called "Priority List"
 * which contains the linked list. It consists of two classes,
 * one for the elements of the list, and one for the list itself.
 * */

public class Assignment2_4_S2 {
    public static void main(String[] args) {
        // Assignment 2 task 4.
        PriorityList system = new PriorityList();
        System.out.println("Adding to priority list. Result: " + system.add_element(5, "Terje"));
        System.out.println("Adding to priority list. Result: " + system.add_element(7, "Kari"));
        System.out.println("Adding to priority list. Result: " + system.add_element(4, "Nils"));
        System.out.println("Adding to priority list. Result: " + system.add_element(8, "Otto"));
        System.out.println("Adding to priority list. Result: " + system.add_element(7, "Syvert"));
        System.out.println("Adding to priority list. Result: " + system.add_element(11, "Lise"));
        System.out.println("Adding to priority list. Result: " + system.add_element(0, "Notto"));
        System.out.println("Adding to priority list. Result: " + system.add_element(1, "Odd"));
        System.out.println("Adding to priority list. Result: " + system.add_element(2, "Even"));

        System.out.println("\nExecuting print all elements in order.");
        System.out.println("Status: " + system.print_all_elements_in_order() + "\n");
        System.out.println("Executing get_highest priority_element. Result: " + system.get_highest_priority_element());
    }
}