import java.util.Random;

public class Bulbasaur extends Pokemon {
    public static final int POKEDEX_INDEX = 4;

    public Bulbasaur () {
        super();
    }

    public Bulbasaur (int level) {
        super(level);
    }

    @Override
    public void shout() {
        System.out.println("Bulbasaur");
    }

    @Override
    public String toString() {
        String conclusion = String.format("Pokemon N°%s ", POKEDEX_INDEX);
        String motherString = super.toString();
        return conclusion + motherString;
    }
}
