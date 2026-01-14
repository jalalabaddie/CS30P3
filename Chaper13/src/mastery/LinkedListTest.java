/*
Program: LinkedListTest
Last Date of this Revision: Jan 14, 2026
Purpose: To demonstrate how to add and remove elements from a Linked List.
Author: Rasheed Allaudin
School: CHHS
Course: Computer Programming 30
*/

package mastery;

import java.util.LinkedList;

public class LinkedListTest
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();

        // Test case 1: add and remove
        list.add("Grape");
      
        list.add("Mango");
       
        list.add("Orange");

        System.out.println("LinkedList after adding Grape, Mango, and Orange:");
       
        System.out.println(list);

        list.remove("Mango");

        System.out.println("LinkedList after removing Mango:");
      
        System.out.println(list);

        // Test case 2: add another element
        list.add("Banana");

        System.out.println("LinkedList after adding Banana:");
       
        System.out.println(list);
    }
}

/*
 
TestCase: 
LinkedList after adding Grape, Mango, and Orange:
[Grape, Mango, Orange]
LinkedList after removing Mango:
[Grape, Orange]
LinkedList after adding Banana:
[Grape, Orange, Banana]
 
 */

