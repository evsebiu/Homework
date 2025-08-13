package ChallengeEqualsHashcodes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Create a generic method to swap the positions of two elements in an array.
public class Exercise11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List: " + list);
        GenericMethod gm = new GenericMethod();
        gm.swapElements(list,1,4);
        System.out.println("After swap");
        System.out.println(list);
    }
}

class GenericMethod{
    public <T> void swapElements(ArrayList<T> list, int index1, int index2){
        if (index1<0 || index2<0 || index1>=list.size() || index2>=list.size()){
            System.out.println("Invalid indices.");
            return;
        }

        Collections.swap(list, index1, index2);
    }
}
