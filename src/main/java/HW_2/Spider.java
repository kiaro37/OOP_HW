package HW_2;

public class Spider extends Insects implements JumpHeight {

    public Spider(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Шшшшшш";
    }

    @Override
    public String toString() {
        return String.format("Spider: %s, JumpHeight: %d",super.toString(), getJumpHeight());
    }

    @Override
    public int getJumpHeight() {
        return 2;
    }
}
