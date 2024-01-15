public class Charmander extends Pokemon {
    public static final int POKEDEX_INDEX = 4;

    public Charmander () {
        super();
    }

    public Charmander (int level) {
        super(level);
    }

    @Override
    public void shout() {
        System.out.println("Charmander");
    }

    @Override
    public String toString() {
        String conclusion = String.format("Pokemon N°%s ", POKEDEX_INDEX);
        String motherString = super.toString();
        return conclusion + motherString;
    }
}
