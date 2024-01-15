public class Charmander extends Pokemon {
    public static final int POKEDEX_INDEX = 4;

    public Charmander() {
        this(1);
    }
    public Charmander(int level) {
        super(level);
    }

    @Override
    public String toString() {
        return String.format("Pokemon N°%s %s de niveau %s et avec %s PV .", POKEDEX_INDEX, this.getClass().getName(), this.getLevel(), this.getPv());
    }
}
