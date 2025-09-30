package characters;

import kickstrategy.KickStrategy;
import lombok.Getter;
import lombok.Setter;


public abstract class Character {

    @Setter
    @Getter
    private int power;
    @Getter
    private int hp;
    @Getter
    @Setter
    private KickStrategy kickStrategy;
    
    public Character(int hp, int power, KickStrategy strategy){
        this.hp = hp;
        this.power = power;
        this.kickStrategy = strategy;
    }

    public void kick(Character other){
        kickStrategy.kick(this, other);
    }

    public boolean isAlive(){
        return  hp != 0;
    }

    public void setHp(int hp) {

        if (hp >= 0){
            this.hp = hp;
        }
        else{
            this.hp = 0;
        }
    }

    public void reducePower(int power_amount){
        this.power = this.power - power_amount;
    }

    public void reduceHp(int damage){
        this.hp = this.hp - damage > 0 ? this.hp - damage : 0;
    }

    public String hitMessage(int damage, Character whoIsKicked){
        return kickStrategy.message(damage, this, whoIsKicked);
    }
} 
