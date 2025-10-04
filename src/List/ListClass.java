package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {

        //TC :O(1)-index
        //add O(n)
      //  ArrayList<Integer>=new ArrayList<>();  parent list from iterable,iterable return iterator
       //simple
        List <Integer> list =new ArrayList<>();


        list.add(0,0);
        list.add(3);  //0
        list.add(1);  //1
        list.add(2); //2nd position
        list.remove(Integer.valueOf(1)); //obj not class //op 1 removed list[0, 2, 3]
//        list.addAll(list);
        System.out.println("list"+list); //


        //sorting
        List <Integer> listSort =new ArrayList<>();
        listSort.add(31);  //0
        listSort.add(11);  //1
        listSort.add(22); //2nd position
        //Collections.sort(listSort);
        listSort.sort(null);
        System.out.println("listSort"+listSort);

   /*     //converting to array
        String[] array1=list.toArray(new String[0]); //0 is type //use
        Object[] array2 = list.toArray();
        Integer[] array3=list.toArray(new Integer[0]); //use
*/
        //add all
        List<Integer> integers = List.of(3, 5, 6, 8);
        list.addAll(integers);
        System.out.println("addIntegers"+list); //addIntegers[0, 1, 5, 80, 3, 5, 6, 8]

        //using reflection we can check the capacity

        System.out.println(list.getClass().getName());
        //with initial capacity of arraylist we can define by own
        List <Integer> list1 =new ArrayList<>(10000);
        System.out.println(list1.getClass().getName());

        //create with an arraylist from another colletion
        //add not possible ,set,replace we can do
        List<String> anotherlist= Arrays.asList("apple","banana","melon");
        ArrayList<String>listFromCollection=new ArrayList<>(anotherlist);
        System.out.println(listFromCollection.getClass().getName());

        String[] array={"a","b","c"};
        List<String> list2=Arrays.asList(array);
        System.out.println(list2.getClass().getName()); //java.util.Arrays$ArrayList static and nested class

        List<Integer> listInt=List.of(1,2,3,4);

       // listInt.set(1,12); //we cannot do
       // listInt.add(1,5); //we cant do

        List<String> list4=new ArrayList<>(anotherlist);
        list4.add(3,"lemon");
        System.out.println(list4);




     List<String> fruits=new ArrayList<>();
     fruits.add("app");
     fruits.add("papaya");
     fruits.add("date");
     fruits.add("bananna");
     fruits.remove(1);
     fruits.remove("date");
     System.out.println("fruits"+fruits);


/*        list.remove(2);
        for (int x:list){
            System.out.println(x);
        }*/

/*        list.add(2,77);
        for (int x:list){
            System.out.println(x);
        }*/

/*
        list.set(1,88);
        for (int x:list){
            System.out.println(x);
        }
        //or directly pass list in sout
        System.out.println(list);
*/


//        list.get(0);
//        System.out.println(list.get(0)); //1
        //System.out.println(list.size()); //3

//        for (int i=0;i< list.size();i++){
//            System.out.println(list.get(i)); //1 5 80 to get list
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
