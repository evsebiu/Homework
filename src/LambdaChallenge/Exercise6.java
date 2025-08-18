package LambdaChallenge;
//Create a functional interface with a method that takes two strings as input and returns an integer.
// Implement this interface using a lambda expression to create a custom comparator that
// compares strings based on their length (not lexicographically).
public class Exercise6 {
    static void main(String[] args) {

        StringComparator lengthComparator = ((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        String a = "Cactus";
        String b = "Flower";

        int result = lengthComparator.compare(a,b);

        if (result < 0){
            System.out.println(a + " is shorter than " + b);
        } else if (result>0) {
            System.out.println(a + " is  longer than " + b);
        } else {
            System.out.println("Both strings are equal in length");
        }
    }
}

@FunctionalInterface
interface StringComparator{
    int compare(String s1, String s2);
}
