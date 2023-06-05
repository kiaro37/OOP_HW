package HW_2;

public abstract class Insects extends Animals {
    public Insects(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Мухи";
    }
}
