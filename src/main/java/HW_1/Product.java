package HW_1;

public class Product {
    private String coffeeName;
    private int volume;
    private int temperature;
    private double price;


    public Product(String coffeeName, int volume, int temperature, double price) {
        this.coffeeName = coffeeName;
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Продукт: %s, объем: %d, цена: %f", coffeeName, volume, price);
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public double getPrice() {
        return price;
    }
}
