package characters;

import kickstrategy.ElfStrategy;

public class Elf extends Character{
    
    public Elf(){
        super(10, 10, new ElfStrategy());
    }

    @Override
    public String toString() {
        return "Elf{hp="+this.getHp()+", power="+this.getPower()+"}";
    }
}
