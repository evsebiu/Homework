package LambdaChallenge;
//Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise3 {
    static void main(String[] args) {
        ListClass numbers = new ListClass();

        int totalSum = numbers.getList().stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Total sum: " + totalSum);
    }
}

class ListClass{
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2312,312,43,564,36));

    public List<Integer> getList(){
        return numbers;
    }
}
