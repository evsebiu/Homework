package ChallengeEqualsHashcodes;
//Extend an enum representing car types to include properties such as average price and manufacturer.
// Override the toString method to provide a descriptive string representing each enum constant.
public class Exercise16 {
    static void main(String[] args) {
        for (Cars cars : Cars.values()){
            System.out.println(cars);
        }

    }
}

enum Cars{
    JEEP("Jeep Recon", 60000),
    SUV("Audi", 82500 ),
    ELECTRIC("Tesla", 30999);

    private double price;
    private String manufacturer;

    Cars(String manufacturer, double price){
        this.manufacturer=manufacturer;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
