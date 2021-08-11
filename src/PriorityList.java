
/**
 * This class is utilized by Assignment2_4_S2. In essence this class
 * is just a linked list. Getters and Setters have been added to the
 * node class which the list consists of, the PriorityElement class.
 *
 * print_all_elements_in_reverse_order() was added in order to show
 * that the linked list is functioning as expected.
 *
 * Getters and Setters have been added, but are not in use, as there
 * was no need to actually change the value of the elements in the
 * task description.
 * */

public class PriorityList {
    PriorityElement highest; // Acts like a head, because the highest value is always the first.
    PriorityElement lowest; // Acts like a tail, because the lowest value is always the last.

    PriorityList() {
        highest = null;
        lowest = null;
    }

    private boolean findElementPosition(PriorityElement priorityElement) {
        for (PriorityElement pE = highest.next; pE.next != pE; pE = pE.next) {
            if (pE.priority > priorityElement.priority && pE.next.priority < priorityElement.priority && pE.priority != priorityElement.priority) {
                priorityElement.prev = pE;
                priorityElement.next = pE.next;
                pE.next.prev = priorityElement;
                pE.next = priorityElement;
                return true;
            } else if (pE.priority == priorityElement.priority) {
                System.out.println("Priority already exists at: " + pE.priority + ": " + pE.name);
                return false;
            }
        }
        System.out.println("An unexpected error occurred when attempting to find element position.");
        return false;
    }

    public boolean add_element(int priority, String name) {
        PriorityElement priorityElement = new PriorityElement(priority, name);
        return add_element(priorityElement);
    }

    public boolean add_element(PriorityElement priorityElement) {
        if (highest == null || lowest == null) {
            highest = priorityElement;
            lowest = priorityElement;
            return true;
        }
        if (priorityElement.priority > highest.priority) {
            highest.prev = priorityElement;
            priorityElement.next = highest;
            highest = priorityElement;
            return true;

        } else if (priorityElement.priority < lowest.priority) {
            lowest.next = priorityElement;
            priorityElement.prev = lowest;
            lowest = priorityElement;
            return true;
        } else {
            return findElementPosition(priorityElement);
        }
    }

    public PriorityElement get_highest_priority_element() {
        System.out.println("Highest priority: " + highest.priority + " - name: " + highest.name);
        return highest;
    }

    public boolean print_all_elements_in_order() {
        for (PriorityElement pE = highest; pE.next != pE; pE = pE.next) {
            System.out.println("Priority: " + pE.priority + " - Name: " + pE.name);
        }
        System.out.println("Priority: " + lowest.priority + " - Name: " + lowest.name);;
        return true;
    }

    public boolean print_all_elements_in_reverse_order() {
        for (PriorityElement pE = lowest; pE.prev != pE; pE = pE.prev) {
            System.out.println("Priority: " + pE.priority + " - Name: " + pE.name);
        }
        System.out.println("Priority: " + highest.priority + " - Name: " + highest.name);;
        return true;
    }

    public class PriorityElement {
        private int priority;
        private String name;
        private PriorityElement prev;
        private PriorityElement next;

        PriorityElement(int priority, String name) {
            this.priority = priority;
            this.name = name;
            this.prev = this;
            this.next = this;
        }

        //<editor-fold desc="Getters&Setters"
        public void setPriority(int priority) {
            this.priority = priority;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNext(PriorityElement next) {
            this.next = next;
        }

        public void setPrev(PriorityElement prev) {
            this.prev = prev;
        }

        public int getPriority() {
            return priority;
        }

        public String getName() {
            return name;
        }

        public PriorityElement getNext() {
            return next;
        }

        public PriorityElement getPrev() {
            return prev;
        }
        //</editor-fold>
    }
}
