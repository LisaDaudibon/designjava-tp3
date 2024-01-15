import java.util.Random;

public class Bulbasaur {
    public static final int POKEDEX_INDEX = 4;
    public int level;
    public int pv;

    static int MAX_ATTACK = 10;

    public Bulbasaur () {
        this(1);
    }
    public Bulbasaur (int level) {
        this.level = level;
        this.pv = level * 5 ;
    }

    public int attack () {
        Random random = new Random();
        int attackPower = random.nextInt(10);

        String attackMessage = attackPower > 0 ?
                String.format("Pokémon %s attaque une intensité de %s", this.getClass().getName(), attackPower) :
                String.format(" Pokémon %s a raté son attaque.", this.getClass().getName());
        return attackPower;
    }

    @Override
    public String toString() {
        return String.format("Pokemon N°%s %s de niveau %s et avec %s PV .", POKEDEX_INDEX, this.getClass().getName(), level, pv);
    }
}
