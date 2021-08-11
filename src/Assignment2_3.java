import java.util.ArrayList;
import java.util.List;


/**
 * 3. Stack and Queue
 * We chose to do it this way to makes it more 'modular' with different values.
 * I've made a method (pushToList) that adds an element to the end of the list.
 * Remove the comments to run that additional method.
 * */

public class Assignment2_3 {

    public static List<Integer> listSize(int x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < x + 1; i++) {
            list.add(i);
        }
        return list;
    }

    public static void pushToList(List<Integer> list, int y) {
        list.add(y);
    }

    // Last-in-first-out
    public static void stackpop(List<Integer> list) {
        list.remove(list.size() - 1);
    }

    // First In First Out
    public static void queuepop(List<Integer> list) {
        list.remove(0);
    }

    public static void main(String[] args) {
        List<Integer> list = listSize(20);
        System.out.println("The list contains: \n" + list + "\n");
        stackpop(list);
        queuepop(list);
        stackpop(list);
        stackpop(list);
        queuepop(list);
        System.out.println("The new list contains: \n" + list + "\n");

        /*
        //pushToList(list, y) is used to push to last part of the list
        pushToList(list, 21);
        System.out.println("The number that got inserted to the list is: " + list.get(list.size()-1));
        System.out.println("The new list is: \n" + list + "\n");

        //stackpop(list) removes to last element
        stackpop(list);
        System.out.println("You removed the last element from the list");
        System.out.println("The new list is: \n" + list + "\n");

        //queuepop(list) removes the first element of the list
        queuepop(list);
        System.out.println("You removed the first element from the list");
        System.out.println("The new list is: \n" + list + "\n");
        */
    }
}
