public interface ElementType {
    ElementTypes getType ();
    boolean isStrongerAgainstType(ElementTypes type);
    int specialAttack();
}

interface Fire extends ElementType {
   int flame ();
}
interface Grass extends ElementType{
    int leafBlade();
}
interface Water extends ElementType {
    int waterGun();
}