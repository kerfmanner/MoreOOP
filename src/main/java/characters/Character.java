package characters;

import lombok.Getter;
import lombok.Setter;


public abstract class Character {

    @Setter
    @Getter
    protected int power;
    @Getter
    protected int hp;


    abstract public void kick(Character other);

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

} 
