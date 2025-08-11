package JavaCollections.ChallengeLinkedList;

//18. Write a Java program to clone an linked list to another linked list.

import java.util.LinkedList;

public class Exercise18 {
    public static void main(String[] args) {

        LinkedList<String> highRiskDrugs = new LinkedList<>();
        highRiskDrugs.add("Cocaine");
        highRiskDrugs.add("LSD");
        highRiskDrugs.add("Metamphetamine");
        highRiskDrugs.add("Amphetamine");

        System.out.println("High risk drugs list: " + highRiskDrugs);


        LinkedList<String> clonedList = (LinkedList<String>) highRiskDrugs.clone();
        System.out.println("Cloned list: " + clonedList);
    }
}
