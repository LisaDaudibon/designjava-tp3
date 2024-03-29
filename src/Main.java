//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pokemon flameche = new Charmander();
        Pokemon max = new Squirtle(6);
        Pokemon violette = new Bulbasaur(10);

        flameche.attack();
        max.attack();
        violette.attack();

//        if (max instanceof Squirtle) {
//            ((Squirtle) max).surf();
//        }
//        if (flameche instanceof Squirtle) {
//            ((Squirtle) flameche).surf();
//        }

        ((Charmander) flameche).specialAttack();
        ((Bulbasaur) violette).leafBlade();

        System.out.println(flameche);
        System.out.println(max);
        System.out.println(violette);

    }
}