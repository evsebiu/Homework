package ChallengeTreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Exercises {
}

class Exercise1{
    public static void main(String[] args) {
        //1.Write a Java program to associate the specified value with the specified key in a Tree Map.
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "kiwi");
        map.put(3,"avocado");
        map.put(6,"banana");
        map.put(25,"cocos");
        map.put(30,"cherry");

        System.out.println("Original map: " + map);

        map.put(3,"tomato");
        System.out.println("Updated map: " + map);

    }
}
class Exercise2{
    public static void main(String[] args) {
        //2. Write a Java program to copy a Tree Map content to another Tree Map
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "kiwi");
        map.put(3,"avocado");
        map.put(6,"banana");
        map.put(25,"cocos");
        map.put(30,"cherry");

        System.out.println("Original map: " + map);

        TreeMap<Integer, String> map2=new TreeMap<>();
        map2.putAll(map);
        System.out.println("Map copied: " + map2);
    }
}

class Exercise3{
    public static void main(String[] args) {
        //3. Write a Java program to search a key in a Tree Map.
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "kiwi");
        map.put(3,"avocado");
        map.put(6,"banana");
        map.put(25,"cocos");
        map.put(30,"cherry");

        System.out.println("Original map: " + map);


        if (map.containsKey(3)){
            System.out.println("Key 3 found " + map.containsKey(3));
        } else {
            System.out.println("Key not found");
        }
    }
}

class Exercise4{
    public static void main(String[] args) {
        //4. Write a Java program to search a value in a Tree Map.
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "kiwi");
        map.put(3,"avocado");
        map.put(6,"banana");
        map.put(25,"cocos");
        map.put(30,"cherry");

        System.out.println("Original map: " + map);

        String valueToSeach = "avocado";

        if (map.containsValue(valueToSeach)){
            System.out.println("Map contains " + valueToSeach);
        } else {
            System.out.println("Value not found");
        }
    }
}

class Exercise5{
    public static void main(String[] args) {
        //5. Write a Java program to get all keys from the given a Tree Map.
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "kiwi");
        map.put(3,"avocado");
        map.put(6,"banana");
        map.put(25,"cocos");
        map.put(30,"cherry");

        System.out.println("Original map: " + map);

        Set<Integer> keys = map.keySet();
        System.out.println("Keys : " + keys);
    }
}

class Exercise6{
    public static void main(String[] args) {
        //6. Write a Java program to delete all elements from a given Tree Map.
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "kiwi");
        map.put(3,"avocado");
        map.put(6,"banana");
        map.put(25,"cocos");
        map.put(30,"cherry");

        System.out.println("Original map: " + map);

        map.clear();
        System.out.println("Map after delete: " + map);
    }
}

class Exercise7{
    public static void main(String[] args) {
        //7. Write a Java program to sort keys in Tree Map by using comparator.
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "kiwi");
        map.put(3,"avocado");
        map.put(6,"banana");
        map.put(25,"cocos");
        map.put(30,"cherry");

        System.out.println("Original map: " + map);

        TreeMap<Integer, String> reverseMap = new TreeMap<>(
                (a,b)->b.compareTo(a)
                );
        reverseMap.put(1, "kiwi");
        reverseMap.put(3,"avocado");
        reverseMap.put(6,"banana");
        reverseMap.put(25,"cocos");
        reverseMap.put(30,"cherry");

        System.out.println("Map with custom comparator (reverse order): " + reverseMap);
    }
}

class Exercise8{
    public static void main(String[] args) {
        //8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "kiwi");
        map.put(3,"avocado");
        map.put(6,"banana");
        map.put(25,"cocos");
        map.put(30,"cherry");

        System.out.println("Original map: " + map);

        Map.Entry<Integer, String> greatestKey = map.lastEntry();
        Map.Entry<Integer, String> leastKey = map.firstEntry();
        System.out.println("Greatest key: " + greatestKey);
        System.out.println("Least key: " + leastKey);
    }
}

class Exercise9{
    public static void main(String[] args) {
        //9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "kiwi");
        map.put(3,"avocado");
        map.put(6,"banana");
        map.put(25,"cocos");
        map.put(30,"cherry");

        System.out.println("Original map: " + map);

        int lowestKey = map.firstKey();
        int highestKey= map.lastKey();
        System.out.println("Lowest KEY: " + lowestKey);
        System.out.println("Highest key: " + highestKey);
    }
}

class Exercise10{
    public static void main(String[] args) {
        //10. Write a Java program to get a reverse order view of the keys contained in a given map.
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "kiwi");
        map.put(3,"avocado");
        map.put(6,"banana");
        map.put(25,"cocos");
        map.put(30,"cherry");

        System.out.println("Original map: " + map);

        Set<Integer> reversedKeys= map.descendingKeySet();
        System.out.println("Reverse order view: " + reversedKeys);

    }
}

class Exercise11{
    public static void main(String[] args) {
        //11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "kiwi");
        map.put(3,"avocado");
        map.put(6,"banana");
        map.put(25,"cocos");
        map.put(30,"cherry");

        System.out.println("Original map: " + map);

        int givenKey = 3;
        if (map.lastKey()<= givenKey ){
            System.out.println("Greatest key less than equal to:  " + givenKey);
        } else {
            System.out.println("Greatest key is not less than equal");
        }
    }
}