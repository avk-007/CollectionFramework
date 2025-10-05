package Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
//eg books in stacks  ..lifo principle
public class StackDemo {
    public static void main(String[] args) {
        //Stack<E> extends Vector<E> so vector methods can be also accessed from stack
        //synchronized all methods
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        System.out.println(stack);

        Integer pop = stack.pop();
        System.out.println(stack);

        Integer push = stack.push(2); //in last
        System.out.println(stack);

        Integer peek = stack.peek(); //peek
        System.out.println(stack);

        System.out.println(stack.isEmpty()); //false
        System.out.println(stack.size()); //4


        int search = stack.search(3); //2 Returns the 1-based position where an object is on this stack
        System.out.println(search);



        //Linklisted as stack can be used ,,double ended linked list
        //Doubly-linked list implementation of the List and Deque interfaces.
        // Implements all optional list operations, and permits all elements (including null).
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(3);
    linkedList.addLast(4);
    linkedList.getLast();
    linkedList.removeLast();
    linkedList.size();
    linkedList.isEmpty();

    //arraylist as stack yes we can do it ,but not preferable
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.get(arrayList.size() - 1); // peek
        arrayList.remove(arrayList.size() - 1); // pop
}
}
