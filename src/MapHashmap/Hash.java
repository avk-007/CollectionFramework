package MapHashmap;

public class Hash {

    public static void main(String[] args) {

        System.out.println(simpleHash("ABC"));
        System.out.println(simpleHash("CBA"));

    }

    public static int simpleHash (String key){
        int sum=0;
        for (char c:key.toCharArray()){
            sum+=(int) c;
        }
        return sum % 10;


    }
}


/*
Class Node<k,v>{
final int hash; //hash code of the key
final ke key;  //the key itself
v value; //value associate with the key
Node<k,v> next; //pointer to the next node in case of collisions (linkedList)

note::
LinkedList O(n)--->BalancedBinary search tree(R B tree) O(logn)


handling collision::
map.put("apple",50);
map.put("banana",30);
map.put("orange",80);

lets say apple and orange end up in the same bucket due to hash collision .
they will be stored in a linked list in that bucket.

Bucket 5:("apple",50) --> ("orange",80);
when we do map.get("orange"),hashmap will go to the bucket 5 and then traverse the LL to find the entry with the key "orange".

Hashmap Resizing:: hashmap has an internal array size .which by default is 16.
   * Default **capacity** = 16
   * Default **load factor** = 0.75
   * So resize happens when `size > 16 × 0.75 = 12`.

   During Rehashing :: the array size is doubled

   Time complexity:: O(1) for put() and get()
   but degraded when collision occurred.
 */