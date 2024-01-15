import java.util.Random;

public class Bulbasaur extends Pokemon {
    public static final int POKEDEX_INDEX = 4;
    public Bulbasaur () {
        this(1);
    }
    public Bulbasaur (int level) {
        this.level = level;
        this.pv = level * 5;
    }
//    @Override
//    public String toString() {
//        return String.format("N°%s", POKEDEX_INDEX);
//        super.toString();
//    }
    @Override
    public String toString() {
        return String.format("Pokemon N°%s %s de niveau %s et avec %s PV .", POKEDEX_INDEX, this.getClass().getName(), level, pv);
    }
}
