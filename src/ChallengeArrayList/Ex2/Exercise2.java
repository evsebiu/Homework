package ChallengeArrayList.Ex2;
// 2. Write a Java program to iterate through all elements in a array list.

import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {

        arrayElements();

    }

    public static void arrayElements(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Apple");
        fruits.add("Pear");

        for(String element : fruits){
            System.out.println(element);
        }
    }
}
