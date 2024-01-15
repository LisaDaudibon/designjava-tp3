import java.util.Random;

public class Squirtle extends Pokemon{
    public static final int POKEDEX_INDEX = 7;
    public Squirtle () {
        super();
    }

    public Squirtle (int level) {
        super(level);
    }

    @Override
    public void shout() {
        System.out.println("Squirtle");
    }

    public class void surf() {
        System.out.println("Squirtle se met à nager.");
    }

    @Override
    public String toString() {
        String conclusion = String.format("Pokemon N°%s ", POKEDEX_INDEX);
        String motherString = super.toString();
        return conclusion + motherString;
    }

}
