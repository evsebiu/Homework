package ChallengeArrayList.Ex5;
// 5. Write a Java program to update specific array element by given element.

import java.util.ArrayList;

public class Exercise5 {
    public static void main(String[] args) {
stundetsList();
    }

    public static void stundetsList(){

        ArrayList <String> stundets = new ArrayList<>();
        stundets.add(0,"Eusebiu");
        stundets.add(1,"Mihai");
        stundets.add(2, "Rares");
        stundets.add(3,"Marian");
        stundets.add(4,"Larisa");

        System.out.println("Default list: " + stundets);

        stundets.set(2,"Lucian");

        System.out.println("Updated list: " + stundets);
    }

}
