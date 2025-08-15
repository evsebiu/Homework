package ChallengeEqualsHashcodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//Create a generic repository class for storing objects. The repository should use a HashMap internally.
// Override equals and hashcode methods to ensure the correct behavior of the repository.
public class Exercise15 {
    static void main() {
        GenericRepository<String> repo1 = new GenericRepository<>();
        repo1.add(1, "Banana");
        repo1.add(2, "Kiwi");

        GenericRepository<String> repo2 = new GenericRepository<>();
        repo2.add(1,"Banana");
        repo2.add(2, "Kiwi");
        System.out.println("Are repositories equals? " + repo1.equals(repo2));
    }
}


class GenericRepository<T>{
    private Map<Integer, T> map = new HashMap<>();

    public void add (Integer key, T value){
        map.put(key, value);
    }

    @Override
    public boolean equals (Object o){
        return o instanceof GenericRepository<?> other
                && Objects.equals(map, other.map);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(map);
    }
}
