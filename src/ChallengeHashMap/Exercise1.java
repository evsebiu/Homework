package ChallengeHashMap;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        // 1. Write a Java program to append the specified element to the end of a hash set.
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("Original list: "+ set );
        set.add(6);
        System.out.println("Modified : " + set);
    }
}

class Exercise2 {
    public static void main(String[] args) {
        //2. Write a Java program to iterate through all elements in a hash list.

        HashSet<Integer> list = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer element : list){
            System.out.println(element);
        }
    }
}

class Exercise3 {
    public static void main(String[] args) {
        //3. Write a Java program to copy all of the mappings from the specified map to another map.

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"grape");
        map1.put(2,"cherry");
        map1.put(3,"vodka");
        System.out.println("first map: " + map1);

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(4,"kiwi");
        map2.put(5,"banana");

        map1.putAll(map2);
        System.out.println("Map combined: " + map1);
    }

    class Exercise4{
        public static void main(String[] args) {
            //4. Write a Java program to remove all of the mappings from a map.
            Map <Integer, String> map1=new HashMap<>();
            map1.put(1,"pc");
            map1.put(2, "tv");
            map1.put(3,"mobile");
            System.out.println("List: " + map1);
            map1.clear();
        }
    }
}

class Exercise5{
    public static void main(String[] args) {
        //5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"potato");
        map.put(2,"chips");
        map.put(3,"carrots");

        if(map.isEmpty()){
            System.out.println("Map have no elements");
        } else {
            System.out.println("Map it's not empty.");
        }
    }
}

class Exercise6{
    public static void main(String[] args) {
        //6. Write a Java program to get a shallow copy of a HashMap instance.
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"red");
        map.put(2,"blue");
        map.put(3,"green");
        map.put(4,"yellow");
        System.out.println("Original map: " + map);

        HashMap<Integer, String> clonedMap = new HashMap<>(map);
        System.out.println("Cloned map: " + clonedMap);
    }
}

class Exercise7{
    public static void main(String[] args) {
        //7. Write a Java program to test if a map contains a mapping for the specified key.
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"grapes");
        map.put(3,"purple");
        map.put(2,"rainbow");

        System.out.println("Map is: " + map);

        int keyToCheck = 5;
        if (map.containsKey(keyToCheck)){ //false
            System.out.println("Map contains: " + keyToCheck);
        } else {
            System.out.println("Map doesn't contain " + keyToCheck);
        }

        int keyToCheck2 = 1;
        if (map.containsKey(keyToCheck2)){ // true
            System.out.println("Map contains: " + keyToCheck2);
        } else{
            System.out.println("map doesn't contain: " + keyToCheck2);
        }
    }
}

class Exercise8{
    public static void main(String[] args) {
        //8. Write a Java program to test if a map contains a mapping for the specified value.
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Potato");
        map.put(2,"Keys");
        map.put(3,"Tractor");
        map.put(4,"French Fries");
        System.out.println("Map is: " + map);

        String valueToCheck = "French Fries";
        if (map.containsValue(valueToCheck)){
            System.out.println("Map contains value: " +valueToCheck);
        } else {
            System.out.println("Map doesn't contain value.");
        }
    }
}

class Exercise9{
    public static void main(String[] args) {
        //9. Write a Java program to create a set view of the mappings contained in a map.
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Potato");
        map.put(2,"Keys");
        map.put(3,"Tractor");
        map.put(4,"French Fries");
        System.out.println("Map is: " + map);

        Set<Map.Entry<Integer, String>> entrySet= map.entrySet();

        System.out.println("Set view: "  + entrySet);
    }
}

class Exercise10 {
    public static void main(String[] args) {
       //10. Write a Java program to get the value of a specified key in a map.
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Potato");
        map.put(2,"Keys");
        map.put(3,"Tractor");
        map.put(4,"French Fries");
        System.out.println("Map is: " + map);

        String getKey = map.get(3);
        System.out.println("Value extracted: " + getKey);

    }
}

class Exercise11{
    public static void main(String[] args) {
        //11. Write a Java program to get a set view of the keys contained in this map
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Potato");
        map.put(2,"Keys");
        map.put(3,"Tractor");
        map.put(4,"French Fries");
        System.out.println("Map is: " + map);

        Set<Integer> key = map.keySet();
        System.out.println("View: " + key);
    }
}

class Exercise12{
    public static void main(String[] args) {
       // 12. Write a Java program to get a collection view of the values contained in this map.
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Potato");
        map.put(2,"Keys");
        map.put(3,"Tractor");
        map.put(4,"French Fries");
        System.out.println("Map is: " + map);

        Collection<String> value = map.values();

        System.out.println("Collections of value: " + value);
    }
}