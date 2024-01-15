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
        return String.format("Pokemon N°%s %s de niveau %s et avec %s PV .", POKEDEX_INDEX, this.getClass().getName(), this.getLevel(), this.getPv());
    }
}
