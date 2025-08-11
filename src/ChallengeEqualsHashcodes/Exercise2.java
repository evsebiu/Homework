package ChallengeEqualsHashcodes;
/*Create a Person class with name, age, and email fields. Implement the equals() method to check only the name and age fields.
Implement the hashCode() method to use the name and age fields to calculate the hash code.
Test that two instances with the same name and age return true for equals() and have the same hash code.*/

import java.util.Objects;

public class Exercise2 {
    public static void main(String[] args) {
        Person person1= new Person("Mugurel Mihailescu", 21, "mugur@gmail.com");
        Person person2= new Person("Mugurel Mihailescu", 21, "mugrel2919@yahoo.ro");
        Person person3 = new Person("Mihai Frunza", 25,"mihaiFrNT@OUTLOOK.com");

        System.out.println("Person 1 equals Person2? " + person1.equals(person2));
        System.out.println("Person 2 equals Person3? " + person2.equals(person3));

        System.out.println("Hash code for person 1 " + person1.hashCode());
        System.out.println("Hash code for person 2 " + person2.hashCode());
        System.out.println("\nHash code for person 3 " + person3.hashCode());
    }
}

class Person{
    private String fullName;
    private int age;
    private String email;

    public Person(String fullName, int age, String email){
        this.fullName=fullName;
        this.age=age;
        this.email=email;
    }
    public String getFullName(){
        return fullName;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        Person otherPerson = (Person) obj;
        return age == otherPerson.age && Objects.equals(fullName, otherPerson.fullName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(fullName, age);
    }
}
