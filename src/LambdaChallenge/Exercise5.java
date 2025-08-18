package LambdaChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

//Create a functional interface that takes a list of integers and returns the maximum value from the list.
// Implement this interface using a lambda expression. Ensure your lambda correctly handles an empty list case
public class Exercise5 {
    static void main(String[] args) {

        HoldList newList = new HoldList();

        Function<List<Integer>, Optional<Integer>> findMax =
                list ->list.stream().max(Integer::compareTo);

        Optional<Integer> max = findMax.apply(newList.list);

        if(max.isPresent()){
            System.out.println("Max value: " + max.get());
        } else{
            System.out.println("The list is empt");
        }
    }

}

class HoldList{
    List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,6,7,8,22,33,55,676));

}
