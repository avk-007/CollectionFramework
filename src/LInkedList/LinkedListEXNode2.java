package LInkedList;

import java.util.Arrays;
import java.util.*;
import java.util.LinkedList;

public class LinkedListEXNode2 {
    public static void main(String[] args) {

        LinkedList<Integer>  linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.get(3); //o(n)
        linkedList.addFirst(4);//O(1)
        linkedList.addLast(0);//O(1)
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println(linkedList);
        linkedList.remove(0);
        linkedList.removeFirst();
        linkedList.removeIf(x-> x%2==0); //pass any comndition
        System.out.println(linkedList);


        LinkedList<String> animals=new LinkedList<>(Arrays.asList("cat","dog","Lion","meow"));
        LinkedList<String> animalsToRemove=new LinkedList<>(Arrays.asList("dog","Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);


        //for Integers
        LinkedList<Integer> integers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        LinkedList<Integer> integers2 = new LinkedList<>(List.of(1, 2, 3, 4, 5));



    }


}
