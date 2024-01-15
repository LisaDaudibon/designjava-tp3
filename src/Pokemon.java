import java.util.Random;

public class Pokemon {
    public int level;
    public int pv;

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

//    @Override
//    public String toString() {
//        return String.format("Pokemon %s de niveau %s et avec %s PV .", this.getClass().getName(), level, pv);
//    }
}