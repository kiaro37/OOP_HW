package HW_2;

import java.util.ArrayList;
import java.util.List;

public abstract class Animals implements Soundable {
    private String name;

    public Animals(String name) {
        this.name = name;
    }
    public abstract String feed();
    public abstract String sound();


    @Override
    public String toString() {
        return String.format("Name: %s, Food: %s",name, feed());
    }


}
