package ChallengeEqualsHashcodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//Simulate a cache where objects are stored.
// Objects with the same hashcode should overwrite existing objects in the cache.
// Consider how would you design the hashcode method to facilitate this.
public class Exercise8 {
    public static void main(String[] args) {
        Cache entity1 = new Cache("Triangle", 2914);
        Cache entity2 = new Cache("Circle", 2914);

        Map<Integer, Cache> cacheMap = new HashMap<>();
        cacheMap.put(entity1.hashCode(), entity1);
        cacheMap.put(entity2.hashCode(), entity2);

        System.out.println("Cache content");
        for (Map.Entry<Integer, Cache> entry : cacheMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " value " + entry.getValue().getName());
        }
    }
}


class Cache{
    private String name;
    private int id;

    public Cache(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }
    @Override
    public boolean equals (Object obj){
        if (this == obj) return true;
        if (obj == null | getClass() != obj.getClass()) return false;
        Cache otherCache = (Cache) obj;

        return id == otherCache.id;
    }

    @Override
    public String toString() {
        return "Cache{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}