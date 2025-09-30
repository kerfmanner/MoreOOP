package characters;

import java.util.Random;
import kickstrategy.NobleStrategy;

public class Knight extends Character{
    static private Random RANDOMIZER = new Random();
    public Knight(){

        super(RANDOMIZER.nextInt(2, 12), RANDOMIZER.nextInt(2, 12 + 1),new NobleStrategy());
    }

    @Override
    public String toString() {
        return "Knight";
    }
}
