package ChallengeArrayList;
// 6. Write a Java program to remove the third element from a array list.

import java.util.ArrayList;

public class Exercise6 {

    public static void main(String[] args) {
        arrayList();
    }


    public static void arrayList(){
        ArrayList <String> colors = new ArrayList<>();
    colors.add(0,"blue");
    colors.add(1,"red");
    colors.add(2,"purple");
    colors.add(3, "green");
    colors.add(4,"yellow");
    colors.add(5,"white");
    colors.add(6,"black");

        System.out.println(colors);
        colors.remove(2);
        System.out.println(colors);
    }
}
