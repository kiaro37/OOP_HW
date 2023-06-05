package HW_2;

public class Gekkon extends Reptile implements JumpHeight{

    public Gekkon(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Пшшш, уррр";
    }

    @Override
    public String toString() {
        return String.format("Gekkon: %s, JumpHeight: %d",super.toString(), getJumpHeight());
    }

    @Override
    public int getJumpHeight() {
        return 0;
    }
}
