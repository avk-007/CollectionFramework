package CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
        //copy on write means that whenever a write proportion
        //like adding or removing an element
        //instead of directly modifying the existing list
        //a new copy  of the list is created and the modification is applied to that copy
        //this ensure that other threads reading the list while its being modified are unaffected.

        //read operations fast and direct,since they happen on a  stable list without interference from modifications.
        //writ operations :: a new copy of the list is created for every modification.

        //notepad--notepad copy
        //read more operation more than use CopyOnWriteArrayList

     //   List<String> shooping=new ArrayList<>(Arrays.asList("milk ","honey","egg","butter"));
        List<String> shooping=new CopyOnWriteArrayList<>(Arrays.asList("milk ","honey","egg","butter"));
        System.out.println("shopping list"+ shooping);

        for (String item:shooping){
            System.out.println(item);
            if (item.equals("egg")){ //read
                shooping.add("mmirchi"); //write
                System.out.println("added mirchi while reading");
            }
        }
        System.out.println("new update shooping list ::"+shooping);
        //Exception in thread "main" java.util.ConcurrentModificationException if used with new ARRayslist ,solution CopyOnWriteArrayList


        //ex with Thread
        //    List<String> sharedList = new ArrayList<>();
       List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");
        Thread readerThread = new Thread(() -> {
            try {
                while (true) {
                    // Iterate through the list
                    for (String item : sharedList) {
                        System.out.println("Reading item: " + item);
                        Thread.sleep(10); // Small delay to simulate work
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in reader thread: " + e);
            }
        });
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(10); // Delay to allow reading to start first
                sharedList.add("Item4");
                System.out.println("Added Item4 to the list.");

                Thread.sleep(10);
                sharedList.remove("Item1");
                System.out.println("Removed Item1 from the list.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        readerThread.start();
        writerThread.start();


    }
}
