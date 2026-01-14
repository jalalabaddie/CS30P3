/*
Program: Test_Queue
Last Date of this Revision: Jan 14, 2026
Purpose: To demonstrate how to add and remove elements from a Queue using LinkedList.
Author: Rasheed Allaudin
School: CHHS
Course: Computer Programming 30
*/

package mastery;

import java.util.Queue;
import java.util.LinkedList;

public class QueueTest
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<String>();

        // Test case 1: add and remove
        queue.add("Grape");
       
        queue.add("Mango");

        System.out.println("Queue after adding Grape and Mango:");
       
        System.out.println(queue);

        String removedItem = queue.remove();

        System.out.println("Removed item: " + removedItem);
       
        System.out.println("Queue after removing:");
       
        
        System.out.println(queue);

        // Test case 2: add another item
        queue.add("Orange");

        System.out.println("Queue after adding Orange:");
       
        System.out.println(queue);
    }
}

/*

TestCase: 
Queue after adding Grape and Mango:
[Grape, Mango]
Removed item: Grape
Queue after removing:
[Mango]
Queue after adding Orange:
[Mango, Orange]

*/