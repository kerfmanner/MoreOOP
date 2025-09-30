package kickstrategy;
import characters.Character;
public interface KickStrategy {

    public void kick(Character whoKick, Character whoIsKicked);
    public String message(int damage, Character whoKick, Character whoIsKicked);
}
