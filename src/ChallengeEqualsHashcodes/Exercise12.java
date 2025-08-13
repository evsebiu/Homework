package ChallengeEqualsHashcodes;
//Create a class Pair which can hold a pair of objects, the objects can be of any type.
public class Exercise12 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Triangle", 3);
        Pair<String, String> pair2 = new Pair<>("Circle", "Round");

        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);

    }
}

class Pair<T, U > {
    private T first;
    private U second;

    public Pair(T first, U second){
        this.first=first;
        this.second=second;
    }

    public T getFirst(){
        return first;
    }
    public U getSecond(){
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
