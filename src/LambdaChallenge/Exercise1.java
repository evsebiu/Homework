package LambdaChallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.
public class Exercise1 {
    static void main() {
        ListCreator creator = new ListCreator();

        List<Integer> even = creator.list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Even numbers: " + even);
    }
}

class ListCreator{
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
}
