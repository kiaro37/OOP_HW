package HW_2;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private List<Animals> terrarium = new ArrayList<>();

    public Terrarium addAnimal(Animals someAnimal) {
        terrarium.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В террариуме обитают: \n");
        for (Animals animal : terrarium
        ) {
            builder.append(animal)
                    .append("\n");
        }
        return builder.toString();
    }

    private List<Soundable> getSoundable() {
        List<Soundable> result = new ArrayList<>(terrarium);
        return result;
    }

    public String getSound() {
        StringBuilder builder = new StringBuilder();
        for (Soundable soundable : getSoundable()
        ) {
            builder.append(soundable.sound()).append("\n");
        }
        return builder.toString();
    }

    public List<JumpHeight> jumpers() {
        List<JumpHeight> jumpers = new ArrayList<>();
        for (Animals animal : terrarium
        ) {
            if (animal instanceof JumpHeight) {
                jumpers.add((JumpHeight) animal);
            }
        }
        return jumpers;
    }

    public JumpHeight getJumpingChampion() {
        List<JumpHeight> jumpers = jumpers();
        JumpHeight champ = jumpers.get(0);
        for (JumpHeight jumper : jumpers
        ) {
            if (champ.getJumpHeight() < jumper.getJumpHeight()) {
                champ = jumper;
            }

        }
        return champ;
    }
}
