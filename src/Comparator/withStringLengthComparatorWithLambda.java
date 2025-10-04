package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class withStringLengthComparatorWithLambda implements Comparator<String> {

    static class myCompartor implements Comparator<Integer>{

        @Override
        public int compare(Integer int1, Integer int2) {
            // return int2-int1; //3 2 1
            return int1-int2; //3 2 1

        }
    }

    @Override
    public int compare(String s1, String s2) {
        //return s2.length()-s1.length(); //op [Bdtddgdgdg, Ddmdldld, Edjjdjdj, Agdgd, Cddd]
        return s1.length()-s2.length(); //[Cddd, Agdgd, Ddmdldld, Edjjdjdj, Bdtddgdgdg]
    }

    public static void main(String[] args) {
        //no
        List<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
//        list.sort(new myCompartor());
//        with lambda exp
        //or
     //   list.sort((a,b)->b.compareTo(a));
        list.sort((a,b)->a-b);
        System.out.println(list);

        //fruits
        List<String> stringsFruits= Arrays.asList("agdgd","cddd","bdtddgdgdg","ddmdldld","edjjdjdj");
//        stringsFruits.sort(new withStringLengthComparator());

//        with lambda exp
        stringsFruits.sort((a,b)->b.length()-a.length());
        System.out.println(stringsFruits);

    }

}

