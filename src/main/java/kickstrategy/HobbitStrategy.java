package kickstrategy;
import characters.Character;

public class HobbitStrategy implements KickStrategy {

    public void kick(Character whoKick, Character whoIsKicked){
        ;
    }


    @Override
    public String message(int damage, Character whoKick, Character whoIsKicked) {
        return "Hobbit cannot kick enemy because his legs are too small. Hobbit is crying.";
    }
}
