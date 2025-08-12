package ChallengeEqualsHashcodes;

import java.util.Objects;
import java.util.Random;

//Create a Student class with name, age, studentId, and email fields.
// Implement the equals() method to check all fields except the studentId.
// Implement the hashCode() method to use all fields except the student Id to calculate the hash code.
// Test that two instances with the same name, age, and email return true for equals() and have the same hash code.
public class Exercise3 {
    public static void main(String[] args) {
        Student s1 = new Student("Marian P",21);
        Student s2= new Student("Marian P", 21);
        Student s3= new Student("Keops Z.", 25);

        System.out.println("Are s1 and s2 equals? " + s1.equals(s2));
        System.out.println("Are s2 and s3 equals? " + s2.equals(s3));
        System.out.println("Are s1 and s3 equals? "  + s1.equals(s3));

        System.out.println("\nStudent Details:");
        System.out.println("S1 → ID: " + s1.getStudentID() + " | Email: " + s1.getEmail());
        System.out.println("S2 → ID: " + s2.getStudentID() + " | Email: " + s2.getEmail());
        System.out.println("S3 → ID: " + s3.getStudentID() + " | Email: " + s3.getEmail());

    }
}

class Student{
    private String name;
    private int age;
    private String studentID;
    private String email;

    public Student ( String name, int age){
        this.name=name;
        this.age=age;
        this.studentID=generateStudentId();
        this.email=generateEmail();
    }

    private String generateStudentId(){
        Random random = new Random();
        int randomNumber = random.nextInt(9000) + 1000;
        return "STU" + randomNumber;
    }
    private String generateEmail(){
        String cleanName = name.toLowerCase().replace(" ", "");
        return cleanName + "@university.com";
    }
    public String getName(){
        return name;
    }
    public String getStudentID(){
        return studentID;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj ) return true;
        if (obj == null|| getClass() != obj.getClass() ) return false;
        Student otherStudent = (Student) obj;
        return age == otherStudent.age&&
                Objects.equals(name, otherStudent.name)&&
                Objects.equals(email,otherStudent.email);
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName(),getAge(),getEmail());
    }
}
