package MapHashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person,String> map=new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person(  "Bob", 2);
        Person p3 = new Person("Alice", 1);

        map.put(p1,"enginner"); //hascode1--> index1
        map.put(p2,"Designner");//hascode2--> index2
        map.put(p3,"manager");//hascode--> index3
        System.out.println("Hashmap size"+map.size());
        System.out.println("Hashmap size::"+map.get(p1));
        System.out.println("Hashmap size::"+map.get(p3));


        //ex 2
        Map<String,Integer> map1=new HashMap<>();
        map1.put("shubham",90); //hascode1--> index1
        map1.put("neha",80);//hascode2--> index2
        map1.put("shubham",93); //same hash code  as hashcode1 ---> index1--> equals()--replace (with 99 now)


    }
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id); //rewritten with condition requirement.
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }

}
