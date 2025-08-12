package ChallengeEqualsHashcodes;
//Implement the equals() and hashCode() methods for a Exercise1 class with
// width and height fields. Test that two instances with the same width and height return
// true for equals() and have the same hash code.


import java.util.Objects;

public class Exercise1 {
    private int width;
    private int height;

    Exercise1(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Exercise1 other = (Exercise1) obj;
        return width == other.width && height == other.height;
    }

    @Override
    public int hashCode(){
        return Objects.hash(width,height);
    }
    @Override
    public String toString(){
        return "Exercise1{" + width +" width " + height + " height " + "}";
    }

    public static void main(String[] args) {
        Exercise1 r1= new Exercise1(10,5);
        Exercise1 r2= new Exercise1(3,6);
        Exercise1 r3 = new Exercise1(10,5);
        System.out.println("R1 equals R2? " + r1.equals(r2));
        System.out.println("R2 equals R3? " + r2.equals(r3));
        System.out.println("R1 equals R3? " + r1.equals(r3));
    }
}
