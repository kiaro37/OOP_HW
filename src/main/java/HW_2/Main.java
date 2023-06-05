package HW_2;

public class Main {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addAnimal(new Spider("Васька")).addAnimal(new Gekkon("Йося")).addAnimal(new Frog("Путешественница"));
        System.out.println(terrarium);

        System.out.println(terrarium.getSound());

        System.out.println("--Jumpers--");
        for (JumpHeight jumpers : terrarium.jumpers()
        ) {
            System.out.println(jumpers);
        }
        System.out.println();
        System.out.println("--Champion of Jumpers--");
        JumpHeight champ = terrarium.getJumpingChampion();
        System.out.println(champ);

    }
}
