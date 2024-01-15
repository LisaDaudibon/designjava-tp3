import java.util.Random;

public class Squirtle ( ){
    static int place = 1;
    int level = 1;
    int pv;

    static int MAX_ATTACK = 10;

    public Squirtle (int pv) {
        pv = this.pv;
    }

    Random random = new Random();
    int damagesDone = random.nextInt(MAX_ATTACK) + 1 ;

    String attack () {


        if( damagesDone == 0 ) {
            System.out.println("Squirtle a raté son attaque.");
        } else {
            System.out.printf("Squirtle attaque une intensité de %s", damagesDone);
        }
    }
}
