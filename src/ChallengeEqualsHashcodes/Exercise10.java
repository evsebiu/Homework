package ChallengeEqualsHashcodes;
//Implement the toString method in a class holding a large dataset to print a “summary” version of the dataset,
// facilitating debugging and logging.

import java.util.Arrays;
import java.util.List;

public class Exercise10 {
    public static void main(String[] args) {
        Database list = new Database(Arrays.asList("Banana", "Kiwi", "Carrots", "Cabbage", "Wine", "Grapes", "TV"));
        System.out.println(list);
    }
}

class Database{
    private List<String> list1;

    public Database(List<String> list1){
        this.list1=list1;
    }

    @Override
    public String toString() {
        return "Database{" +
                "\nsize:" + list1.size() +
                "\npreview, first 4 items: " + list1.subList(0,4) +
                '}';
    }
}