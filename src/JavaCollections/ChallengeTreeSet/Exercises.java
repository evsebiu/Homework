package JavaCollections.ChallengeTreeSet;

import java.util.*;

public class Exercises {
}

class Exercise1{
    public static void main(String[] args) {
        //1.Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("purple");
        System.out.println("List: " + colors);
    }
}

class Exercise2{
    public static void main(String[] args) {
        //2. Write a Java program to iterate through all elements in a tree set.
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("purple");
        System.out.println("List: " + colors);

        for (String elements:colors){
            System.out.println(elements);
        }
    }
}

class Exercise3{
    public static void main(String[] args) {
        //3. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("purple");
        System.out.println("List: " + colors);

        TreeSet<String> colors2 = new TreeSet<>();
        colors.add("yellow");
        colors.add("brown");
        colors.add("Pink");
        System.out.println("List 2: " + colors);

        colors.addAll(colors2);
        System.out.println("List combined: " + colors);

    }
}

class Exercise4{
    public static void main(String[] args) {
        //4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("purple");
        System.out.println("List: " + colors);

        NavigableSet<String> reversedColors = colors.descendingSet();
        System.out.println("Reversed view list: " + reversedColors);
    }
}

class Exercise5{
    public static void main(String[] args) {
        //5. Write a Java program to get the first and last elements in a tree set.
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("purple");
        System.out.println("List: " + colors);

        String firstElement= colors.getFirst();
        String lastElement = colors.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}

class Exercise6{
    public static void main(String[] args) {
        //6. Write a Java program to clone a tree set list to another tree set.
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("purple");
        System.out.println("List: " + colors);

        TreeSet<String> clonedList = (TreeSet<String>) colors.clone();
        System.out.println("Cloned list is: " + clonedList);
    }
}

class Exercise7{
    public static void main(String[] args) {
       // 7. Write a Java program to get the number of elements in a tree set.
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("purple");
        System.out.println("List: " + colors);

        int countElements = colors.size();
        System.out.println(countElements);
    }
}

class Exercise8{
    public static void main(String[] args) {
        //8. Write a Java program to compare two tree sets.
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("purple");
        System.out.println("List: " + colors);

        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("raspberry");
        System.out.println("List: " + fruits);

        if (colors.equals(fruits)){
            System.out.println("Lists are equals");
        } else {
            System.out.println("Lists are not equal");
        }

    }
}

class Exercise9{
    public static void main(String[] args) {
        //9. Write a Java program to find the numbers less than 7 in a tree set.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(91);
        numbers.add(10);
        numbers.add(8);
        numbers.add(4);

        int numbersToFind = 7;

        SortedSet<Integer> numbersLessThanSeven = numbers.headSet(numbersToFind);
        System.out.println("Numbers less than: " + numbersToFind + " are " + numbersLessThanSeven);
    }
}

class Exercise10{
    public static void main(String[] args) {
        //10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(91);
        numbers.add(10);
        numbers.add(8);
        numbers.add(4);

        int givenElement = 9;

        SortedSet<Integer> greaterOrEqual =numbers.tailSet(givenElement);
        System.out.println("Element : " + givenElement + " set " + greaterOrEqual);
    }
}

class Exercise11{
    public static void main(String[] args) {
        //11. Write a Java program to get the element in a tree set which is less than or equal to the given element.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(91);
        numbers.add(10);
        numbers.add(8);
        numbers.add(4);

        int givenElement = 9;
        SortedSet<Integer> lessOrEqual = numbers.headSet(givenElement, true);
        System.out.println("Numbers less / equal than " + givenElement + " are " + lessOrEqual);
    }
}

class Exercise12{
    public static void main(String[] args) {
        //12. Write a Java program to get the element in a tree set which
        // is strictly greater than or equal to the given element.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(91);
        numbers.add(10);
        numbers.add(8);
        numbers.add(4);

        int givenElement = 9;

        SortedSet<Integer> greaterOrEqual = numbers.tailSet(givenElement, true);
        System.out.println("Number: " + givenElement + " equal or higher are" + greaterOrEqual);
    }
}

class Exercise13{
    public static void main(String[] args) {
        //13. Write a Java program to get an element in a tree set which is strictly less than the given element.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(91);
        numbers.add(10);
        numbers.add(8);
        numbers.add(4);

        int givenElement = 9;
        SortedSet<Integer> strictlyLessThan = numbers.headSet(givenElement);
        System.out.println("Numbers strictly less than " + givenElement + " are: " + strictlyLessThan);

    }
}

class Exercise14{
    public static void main(String[] args) {
        //14. Write a Java program to retrieve and remove the first element of a tree set.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(91);
        numbers.add(10);
        numbers.add(8);
        numbers.add(4);

        int removeAndRetrieve= numbers.pollFirst();
        System.out.println("Retrieved and removed element: " + removeAndRetrieve);
    }
}

class Exercise15{
    public static void main(String[] args) {
        //15. Write a Java program to retrieve and remove the last element of a tree set.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(91);
        numbers.add(10);
        numbers.add(8);
        numbers.add(4);

        int removeAndRetrieve = numbers.pollLast();
        System.out.println("Retrieved and removed last element: " + removeAndRetrieve);
    }
}

class Exercise16{
    public static void main(String[] args) {
        //16. Write a Java program to remove a given element from a tree set.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(91);
        numbers.add(10);
        numbers.add(8);
        numbers.add(4);
        System.out.println("Original list:" +numbers) ;
        boolean remove = numbers.remove(1);
        System.out.println("After removal: " + numbers);

    }
}