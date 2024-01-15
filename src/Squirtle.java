import java.util.Random;

public class Squirtle extends Pokemon{
    public static final int POKEDEX_INDEX = 7;

    public Squirtle () {
        this(1);
    }
    public Squirtle (int level) {
        super(level);
    }

    @Override
    public String toString() {
        String conclusion = String.format("Pokemon N°%s ", POKEDEX_INDEX);
        String motherString = super.toString();
        return conclusion + motherString;
    }
}
