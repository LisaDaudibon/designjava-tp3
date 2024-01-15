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

        max.surf();

        System.out.println(flameche);
        System.out.println(max);
        System.out.println(violette);

    }
}