package ChallengeEqualsHashcodes;
//Create a class Pair which can hold a pair of objects, the objects can be of any type.
public class Exercise12 {
    public static void main(String[] args) {
        Object obj = new Object("Triangle");
        Object obj2 = new Object("Triangle");
        System.out.println("Object 1: " + obj + " object 2: " +  obj2);
    }
}

class Object{
    private String name;
    public Object(String name){
        this.name=name;
    }
}
