package HW_3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Double list = new Double();
        list.add("data1");
        list.add("data2");

        list.add(1, "data2_1");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        for (Object el : list
        ) {
            System.out.println(el);

        }

    }
}
