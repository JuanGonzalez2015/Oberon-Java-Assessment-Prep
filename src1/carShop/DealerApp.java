package carShop;

public class DealerApp {

    public static void main(String[] args) {
        Customer person = new Customer("Jordy", "Muniz");
        Car car = new Car("Dodge", "sxt", "black", 2010);
        System.out.println(person.describe(String.format("%s, %s, %s", car.getModel(), car.getYear(), car.getMake(), car.getYear())));
    }
}
