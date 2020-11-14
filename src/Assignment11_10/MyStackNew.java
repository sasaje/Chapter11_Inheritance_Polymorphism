/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 13/11/2020
 *
 */

package Assignment11_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyStackNew extends java.util.ArrayList{
    ArrayList<Object> list = new ArrayList<>();

    public static void main(String[] args) {
        // Declaring arraylist without any initial size
        ArrayList<Object> list = new ArrayList<>();

        System.out.println("Please enter five strings: ");
        Scanner input = new Scanner(System.in);

        // Appending elements at the end of the list from user input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextLine());
        }

        System.out.print("Elements before reversing: ");
        printElements(list);

        // Collections.reverse method takes a list as parameter and returns the reversed list
        Collections.reverse(list);
        System.out.print("Elements after reversing: ");
        printElements(list);
    }

    // Iterate through all the elements and print them
    public static void printElements(ArrayList<Object> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(getSize()-1);
    }

    public Object pop(){
        Object o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }

    public void push(Object o){
        list.add(o);
    }

    @Override
    public String toString(){
        return "Stack: " + list.toString();
    }
}