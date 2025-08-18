package LambdaChallenge;
//Create a functional interface that takes a List<Integer> and a function that takes an integer
// as input and returns an integer. Implement this interface using a lambda expression to apply
// the function to each element in the list, returning a new list with the mapped values.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@FunctionalInterface
interface ListMapper {
    List<Integer> map(List<Integer> list, Function<Integer, Integer> func);
}
public class Exercise8 {
    public static void main(String[] args) {
        ListMapper mapper = (list, func) -> {
            List<Integer> result = new ArrayList<>();
            for (Integer i : list) {
                result.add(func.apply(i));
            }
            return result;
        };

        List<Integer> numbers  = List.of(1,2,3,4,5,6,7,8,9,10);
        Function<Integer, Integer> square = x -> x*x;

        List <Integer> squared = mapper.map(numbers, square);
        System.out.println(squared
        );
    }
}