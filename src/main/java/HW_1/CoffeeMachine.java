package HW_1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Product> machine = new ArrayList<>();
    private double cash = 0;

    public CoffeeMachine addProduct(Product coffee) {
        machine.add(coffee);
        return this;
    }

    public List<Product> getMachine() {
        return machine;
    }

    public Product findCoffee(String name) {
        for (Product coffee : machine
        ) {
            if (name.equals(coffee.getCoffeeName())) {
                return coffee;
            }
        }
        return null;
    }


    public Product saleCoffee(String coffeeName) {
        Product coffee = findCoffee(coffeeName);
        if (coffee != null) {
            cash = cash + coffee.getPrice();
            machine.remove(coffee);
        }
        return coffee;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в автомате: ").append(cash).append("\n");
        for (Product coffee : machine
        ) {
            builder.append(coffee).append("\n");
        }
        return builder.toString();
    }
}
