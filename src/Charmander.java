public class Charmander extends Pokemon {
    public static final int POKEDEX_INDEX = 4;

    public Charmander() {
        this(1);
    }
    public Charmander(int level) {
        this.level = level;
        this.pv = level * 5 ;
    }

    @Override
    public String toString() {
        return String.format("Pokemon N°%s %s de niveau %s et avec %s PV .", POKEDEX_INDEX, this.getClass().getName(), level, pv);
    }
}
