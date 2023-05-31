package HW_1;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.addProduct(new Product("Latte", 200, 90, 40))
                .addProduct(new Product("Espresso", 50, 90, 30))
                .addProduct(new Product("Cappuchino", 300, 70, 50));

        for (Product prod : machine.getMachine()
        ) {
            System.out.println(prod);
        }

        System.out.println("------------------------------------------");
        Product product = machine.findCoffee("Latte");
        System.out.println(product);
        System.out.println("------------------------------------------");
        Product saleProd = machine.saleCoffee("Espresso");
        System.out.println(saleProd);
        System.out.println("------------------------------------------");
        System.out.println(machine);
    }
}
