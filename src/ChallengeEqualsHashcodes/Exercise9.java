package ChallengeEqualsHashcodes;
//Create a method that returns a JSON representation of an object.
//The method should make use of the toString method to facilitate this.
public class Exercise9 {

    public static String objectToJson(Object obj){
        return obj.toString();
    }

    public static void main(String[] args) {
        FoodMenu food1= new FoodMenu("Kebap","250kcal / 100g", 25);
        System.out.println(objectToJson(food1));
    }
}

class FoodMenu{
    private String foodType;
    private String kcal;
    private int price;

    public FoodMenu(String foodType, String kcal, int price){
        this.foodType=foodType;
        this.kcal=kcal;
        this.price=price;
    }
    public String toString(){
        return "{\n" +
                "  \"name\": \"" + foodType + "\",\n" +
                "  \"price\": " + price + ",\n" +
                "  \"nutritional_values\": \"" + kcal + "\"\n" +
                "}";
    }
}
