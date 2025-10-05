package MapHashmap;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<CustomKey, Integer> fruitMap = new HashMap<>();

        CustomKey key1 = new CustomKey("apple", 100);
        CustomKey key2 = new CustomKey("banana", 100); // same hash -> collision

        fruitMap.put(key1, 50);
        fruitMap.put(key2, 80);
        fruitMap.put(new CustomKey("orange", 200), 30);

        System.out.println("Map content:");
        for (CustomKey k : fruitMap.keySet()) {
            System.out.println(k.name + " = " + fruitMap.get(k));
        }
    }
}

class CustomKey {
    String name;
    int hash;

    CustomKey(String name, int hash) {
        this.name = name;
        this.hash = hash;
    }

    @Override
    public int hashCode() {
        return hash; // manually set hash to force collision
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CustomKey)) return false;
        return this.name.equals(((CustomKey) obj).name);
    }
}
