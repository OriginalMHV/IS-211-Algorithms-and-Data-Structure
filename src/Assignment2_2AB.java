import java.util.ArrayList;
import java.util.List;
/**
 * Assignment 2 task 2 A and B.
 * With the approach below, one can input any array with any target value,
 * and the functions should attempt to return a list of arrays with the
 * target value.
 *
 * First it will print out substrings with the target value, and thereafter
 * it will print out the pairs.
 * The list is then printed out by accessing every array of the list and
 * adding them to a string ready to be put into a system.out.
 * */

public class Assignment2_2AB {
    public static void main(String[] args){
        // Assignment 2_2 Array, and target value for 2.2a and 2.2b.

        int[] assignmentArray = {4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};
        int target = 0;
        System.out.println("Given an array of values: [" + arrayToString(assignmentArray) + "]\n");

        // Assignment 2a).
        List<int[]> subArrays = findSubArrays(assignmentArray, target);
        System.out.println("Substrings in array with target value: " + target +  "\n" + listOfArraysToString(subArrays));

        //Assignment 2b).
        List<int[]> pairsOfElements = pairsOfElements(assignmentArray, target);
        System.out.println("Pairs of Elements with target value: " + target + "\n" + listOfArraysToString(pairsOfElements));
    }

    public static List<int[]> findSubArrays(int[] arr, int target) {
        List<int[]> subArrays = new ArrayList<>();

        for (int x = 0; x < arr.length; x++) {
            int curSum = 0;
            int[] curSubArray;

            int y;
            for (y = 0; x + y < arr.length; y++) {
                curSum += arr[x + y];

                if (curSum == target) {
                    curSubArray = new int[y + 1]; // Creates a new array the length of the subArray.

                    for (int z = 0; z < y + 1; z++) { // Copies over the subarray to the new array.
                        curSubArray[z] = arr[x + z];
                    }
                    subArrays.add(curSubArray); // Adds the subarray to the list over the subarrays.
                }
            }
        }
        return subArrays;
    }

    // Pairs elements in an array, which when added together gets a target value.
    public static List<int[]> pairsOfElements(int[] arr, int target) {
        List<int[]> pairs = new ArrayList<>();
        int[] pair;

        for (int x = 0; x < arr.length; x++){
            pair = new int[2]; // Initializes and cleans the array at every iteration of x.
            pair[0] = arr[x];

            for (int y = x+1; y+1 < arr.length; y++){
                pair[1] = arr[y];

                if (pair[0] + pair[1] == target){
                    pairs.add(new int[]{pair[0], pair[1]}); // Adds a int[2] array of the values into the list of pairs.
                }
            }
        }
        return pairs;
    }

    // Returns a string of elements in an array.
    public static String arrayToString(int[] array){
        StringBuilder output = new StringBuilder();
        for(int value:array){
            output.append(" ").append(value).append(" ");
        }
        return output.toString();
    }

    // Returns a string of arrays from a list of arrays.
    public static String listOfArraysToString(List<int[]> arrays){
        int i = 0;
        StringBuilder output = new StringBuilder();

        for(int[] array:arrays){
            i++;
            output.append(i).append(": [");
            output.append(arrayToString(array));
            output.append("]\n");
        }
        return output.toString();
    }
}
