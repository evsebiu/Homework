package ChallengeEqualsHashcodes;

import java.util.Objects;

//Create a Product class with name, price, and id fields.
// Implement the equals() method to check only the id field.
// Implement the hashCode() method to use the id field to calculate the hash code.
// Test that two instances with the same id return true for equals() and have the same hash code.
// Then change the id of one instance and test that they are no longer equal and have different hash codes.
public class Exercise5 {
    public static void main(String[] args) {
        Product firstProduct = new Product("Toothpaste", 25,123456);
        Product secondProduct = new Product("Pasta Sauce", 10,123456);
        System.out.println("Is firstProduct equals to secondProduct based on ID? " + firstProduct.equals(secondProduct));
        System.out.println("Does firstProduct and secondProduct have same hashCode? " + (firstProduct.hashCode() == secondProduct.hashCode()));
        System.out.println("-----------------------------------------------------------------");
        Product firstProduct1 = new Product("Toothpaste", 25,123456);
        Product secondProduct2 = new Product("Pasta Sauce", 10,123356);
        System.out.println("Is firstProduct equals to secondProduct based on ID? " + firstProduct1.equals(secondProduct2));
        System.out.println("Does firstProduct and secondProduct have same hashCode? " + (firstProduct1.hashCode() == secondProduct2.hashCode()));
    }
}

class Product{
    private String name;
    private int price;
    private int id;

    public Product(String name, int price, int id){
        this.name=name;
        this.price=price;
        this.id = id;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product newProduct = (Product) obj;
        return Objects.equals(id, newProduct.id);
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }


}
