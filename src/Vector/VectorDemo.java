package Vector;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
//        Vector<Integer> vector=new Vector<>(6);
        Vector<Integer> vector=new Vector<>(6,3); //* by 3
        //capacity doubles when added new list in index
//al vectors methods are  synchronised and thread safe and used for thread safety for single thread env
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1); //aded extrra and capacity doubles 6 to 12
        vector.containsAll(vector);
        vector.clear();
        System.out.println(vector.capacity());

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(7);

        Vector<Integer> vectos2=new Vector<>(linkedList); //it can take list from linkedList as well.
        System.out.println(vectos2);

        for(int i=0;i<vectos2.size();i++){
            System.out.println("vectors 2"+vectos2.get(i));
        }
        vectos2.clear();
        System.out.println("clear"+vectos2);



        //with thread correct 2000 no data loss
        Vector<Integer> list = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list.size()); // Output: 2000
    }
}
