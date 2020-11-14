/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 13/11/2020
 *
 */

package Assignment11_10;

/*
* (Implement myStack using inheritance) In Listing 11.10, MyStack is implemented using composition.
* Define a new stack class that extends ArrayList.
* Draw a UML diagram for the classes then implement MyStack.
* Write a test program that prompts the user to enter five strings and displays them in reverse order.
*
* UML Diagram:
*
* -------------------------- *  * ----------------------- *
*          MyStack           |  *       MyStackNew        |
* -------------------------- *  * ----------------------- *
* - list : ArrayList<Object> *  * - list : ArrayList      *
* -------------------------- *  * ----------------------- *
* + isEmpty(): boolean       *  * + isEmpty(): boolean    *
* + getSize(): int           *  * + getSize(): int        *
* + peek(): Object           *  * + peek(): Object        *
* + pop(): Object            *  * + pop(): Object         *
* + push(o Object): void     *  * + push(o Object): void  *
* + toString(): String       *  * + toString(): String    *
* -------------------------- *  * ----------------------- *
*
* */

import java.util.ArrayList;

public class MyStack extends java.util.ArrayList{

    private ArrayList<Object> list = new ArrayList<>();

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
