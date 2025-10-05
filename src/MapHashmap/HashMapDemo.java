package MapHashmap;

//kv pairs ex:roll no and name
//key unique ie roll no
//value :can be duplicates
//one value per key
//order maintains insertion order(linkedhashmap)
//natural order with (treemap)
//No order with (hashmap)
//not synchronised
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
//        HashMap hashMap=new HashMap();
        HashMap<Integer,String> hashMap=new HashMap();
        hashMap.put(1,"abhi");
        hashMap.put(2,"sumit");
        hashMap.put(3,"kajal");
        hashMap.put(4,"komal");
        hashMap.put(null,"ram");
        System.out.println(hashMap);

        String s = hashMap.get(4);
        System.out.println(s);

        String put = hashMap.put(1,"neela");
        System.out.println(put);

        boolean b = hashMap.containsKey(2);
        System.out.println(b);

        boolean b1 = hashMap.containsValue("kajal");
        System.out.println(b1);

        //loop
        for (Integer i : hashMap.keySet()) {
            System.out.println(hashMap.get(i));

        }
      //entrySet ,entry contains k,v  ,,hashMap.entrySet();
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry:  entries){
            System.out.println(entry.getKey()+":"+entry.getValue().toUpperCase());

        }

        String remove = hashMap.remove(2);
        String remove1 = String.valueOf(hashMap.remove(2,"sumit"));
        System.out.println(hashMap);

        //contains
        List<Integer> listInt=Arrays.asList(2,32,456,77,78);
        boolean contains = listInt.contains(32);
        System.out.println("contains  ::"+contains);
    }
}
