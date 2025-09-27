import characters.Character;
import characters.Elf;


public class Demo {
    public static void main(String args[]) {
        Character c1 = new Elf();
        Character c2 = new Elf();
        GameManager.fight(c1, c2);
    }
}
