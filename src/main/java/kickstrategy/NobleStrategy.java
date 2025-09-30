package kickstrategy;

import characters.Character;
import java.util.Random;

public class NobleStrategy implements KickStrategy {
    static private Random randomizer = new Random();
    public void kick(Character whoKick, characters.Character whoIsKicked){

        int damage = randomizer.nextInt(whoKick.getPower());
        whoIsKicked.reduceHp(damage);
    }
    @Override
    public String message(int damage, Character whoKick, Character whoIsKicked) {
        return new String(whoKick + " kicks enemy " + whoIsKicked + ", and deals " + damage + " damage!");
    }
    
    
}
