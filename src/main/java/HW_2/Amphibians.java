package HW_2;

public abstract class Amphibians extends Animals {
    public Amphibians(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Летающие насекомые";
    }
}
