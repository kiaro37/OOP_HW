package HW_2;

public class Frog extends Amphibians implements JumpHeight{
    public Frog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Ква ква";
    }

    @Override
    public String toString() {
        return String.format("Frog: %s, JumpHeight: %d",super.toString(),getJumpHeight());
    }

    @Override
    public int getJumpHeight() {
        return 5;
    }
}
