package characters;

import java.util.Random;

public abstract class VariablePowerCharacter extends Character {

    final private static Random stats_randomizer = new Random();


    public VariablePowerCharacter(int minHp, int maxHp, int minPower, int maxPower){

        this.power = stats_randomizer.nextInt(minPower, maxPower + 1);
        this.hp = stats_randomizer.nextInt(minHp, maxHp + 1);

    }

    public void kick(Character other){
        int damage = stats_randomizer.nextInt(power + 1);
        other.reduceHp(damage);

        System.out.println(this + " deals " + damage + " amount of damage to enemy " + other + ". Enemy is now left with " + other.getHp() );
    }
    
}
