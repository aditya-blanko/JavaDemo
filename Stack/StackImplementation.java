package Stack;

import java.util.Stack;

public class StackImplementation {
    
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


        // peek function prints the element at top
        System.out.println("top most element of the stack is " + stack.peek());

        // pop function deletes the top element
        stack.pop();

        // peek function prints the element at top
        System.out.println("top most element of the stack is " + stack.peek());

        // to search an element in the stack
        // indexing of element in search function is done from top and it starts from 1
        System.out.println("Element 2 is present at "+ stack.search(2) + " positon");

        // empty function checks whether the stack is empty or not its return type is boolean
        System.out.println("Is stack empty or not :" + stack.empty());
    }
}
