package LambdaChallenge;
//Create a functional interface that takes a string and an integer n as parameters and returns a string.
// Implement it using a lambda expression that returns the first n characters of the string.
// If n is larger than the length of the string, it should return the full string.

@FunctionalInterface
interface StringTrimmer{
    String trim(String input, int n);
}

public class Exercise7 {
    public static void main(String[] args){
        StringTrimmer trimmer = (input, n) -> {
            if (input == null) return "";
            if (n < 0) return "";
            return input.length() <= n ? input : input.substring(0, n);
        };

        String original = "Cactus";
        System.out.println(trimmer.trim(original, 7));
    }
}
