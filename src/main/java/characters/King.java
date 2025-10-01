package characters;

import java.util.Random;

import kickstrategy.NobleStrategy;

public class King extends Character {

    final private static Random stats_randomizer = new Random();

    public King(){
        super(stats_randomizer.nextInt(5, 15 + 1), stats_randomizer.nextInt(5, 15 + 1),  new NobleStrategy());
    }

    @Override
    public String toString() {
        return "King{hp="+this.getHp()+", power="+this.getPower()+"}";
    }

    
}
