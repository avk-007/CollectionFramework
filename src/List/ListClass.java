package List;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
      //  ArrayList<Integer>=new ArrayList<>();  parent list from iterable,iterable return iterator
        List <Integer> list =new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(80);

//        list.get(0);
//        System.out.println(list.get(0)); //1
        //System.out.println(list.size()); //3

//        for (int i=0;i< list.size();i++){
//            System.out.println(list.get(i)); //1 5 80
//        }

/*        for(int x: list){
            System.out.println(x); //1 5 80
        }

        System.out.println(list.contains(5));
        System.out.println(list.contains(80));
        System.out.println(list.contains(90));*/

/*        list.remove(2);
        for(int x: list){
            System.out.println(x); //1 5
        }*/

 /*       list.add(2,100);
        for(int x: list){
            System.out.println(x); //1 5 100 80
        }*/

/*        list.set(2,50);
        for(int x: list){
            System.out.println(x); //1 5 50
        }*/

/*
        //or other way to set
        list.set(2,50);
        System.out.println(list); //1 5 50
        */


    }

}
