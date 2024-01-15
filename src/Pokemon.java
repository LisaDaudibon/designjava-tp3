import java.util.Random;

public class Pokemon {
    private int level;
    private int pv;

    public int getLevel () {
        return this.level;
    }

    protected int setLevel () {
        this.level = level;
    }

    public int getPv () {
        return this.pv;
    }

    protected int setPv () {
        this.pv = pv ;
    }

    public Pokemon () {
        this(1);
    }
    public Pokemon (int level) {
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
        return String.format("%s de niveau %s et avec %s PV .", this.getClass().getName(), level, pv);
    }
}
