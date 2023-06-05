package HW_2;

public abstract class Reptile extends Animals {
    public Reptile(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Жучки, паучки";
    }
}
