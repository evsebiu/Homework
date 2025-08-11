package JavaCollections.ChallengeArrayList;

// 7. Write a Java program to search an element in a array list.

import java.util.ArrayList;

public class Exercise7 {
    public static void main(String[] args) {

        arrayList();

    }

    public static void arrayList(){
        ArrayList< Integer > numbers = new ArrayList<Integer>();
        numbers.add(0,1);
        numbers.add(1,2);
        numbers.add(2,3);
        numbers.add(3,4);
        numbers.add(4,5);
        numbers.add(5,6);
        numbers.add(6,7);
        System.out.println("Numbers list: " + numbers);

        int elementToSearch = 5;

        if (numbers.contains(elementToSearch)){
            System.out.println("Array list contains " + elementToSearch);
        }
        else {
            System.out.println("Element not found in list ");
        }

    }
}
