/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 13/11/2020
 *
 */

package Assignment11_6;

/*
* (Use ArrayList) Write a program that creates an ArrayList and adds a Loan object, a Date object, a string,
* and a Circle object to the list, and use a loop to display all the elements in the list by invoking the object's
* toString() method.
*/

import java.util.ArrayList;
import java.util.List;

public class UseArrayListLoan {

    public static void main(String[] args) {
        arrayListWithDifferentTypes();
    }

    // To combine different object types in the same ArrayList use the Object generic type.
    public static void arrayListWithDifferentTypes() {
        List<Object> list = new ArrayList<>();

        list.add(new Loan());
        list.add(new Date());
        list.add(new String());
        list.add(new Circle());

        System.out.println("All the objects in the ArrayList: ");
        for( Object item : list ) {
            if( item instanceof Loan) {
                System.out.println("- " + item.getClass().getSimpleName() + " is a Loan object");
            } else if( item instanceof Date) {
                System.out.println("- " + item.getClass().getSimpleName() + " is a Date object");
            }else if( item instanceof String) {
                System.out.println("- " + item.getClass().getSimpleName() + " is a String object");
            }else if( item instanceof Circle) {
                System.out.println("- " + item.getClass().getSimpleName() + " is a Circle object");
            }
        }
    }
}
