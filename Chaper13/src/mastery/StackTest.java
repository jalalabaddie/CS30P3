/*
Program: Stack
Last Date of this Revision: Jan 14, 2026
Purpose: To demonstrate how to push and pop elements using a Stack.
Author: Rasheed Allaudin
School: CHHS
Course: Computer Programming 30
*/
package mastery;

import java.util.Stack;

public class StackTest
{
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();

        //test case 1: push and pop
        stack.push("Grape");
      
        stack.push("Mango");

    
        System.out.println("Stack after pushing Grape and Mango:");
    
        System.out.println(stack);

        String removedItem = stack.pop();

     
        System.out.println("Popped item: " + removedItem);
      
        System.out.println("Stack after popping:");
       
        System.out.println(stack);

        //test case 2: push another element
        stack.push("Orange");

        System.out.println("Stack after pushing Orange:");
       
        System.out.println(stack);
    }
}

/*
TestCase: 

Stack after pushing Grape and Mango:
[Grape, Mango]
Popped item: Mango
Stack after popping:
[Grape]
Stack after pushing Orange:
[Grape, Orange]


*/