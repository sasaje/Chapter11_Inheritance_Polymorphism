/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 13/11/2020
 *
 */

package Assignment11_4;

/*
 * Write the following method that returns the maximum value in an ArrayList of integers.
 * The method returns null if the list is null or the list size is 0.
 *
 * public static Integer max(ArrayList<Integer> list)
 *
 * Write a test program that prompts the user to enter a sequence of numbers ending with 0 and invokes this method to
 * return the largest number in the input
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumElementInArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a sequence of integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt(); // read a value from the input

            if (!list.contains(value) && value != 0)
                list.add(value); // add value if it is not already in the arrayList and is not 0
        } while (value != 0);

        System.out.println(max(list));
    }

    public static Integer max(ArrayList<Integer> list){
        // display the maximum integer in ArrayList
        return java.util.Collections.max(list);
    }
}


