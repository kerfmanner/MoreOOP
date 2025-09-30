package kickstrategy;

import characters.Character;

public class ElfStrategy implements KickStrategy{
    public void kick(Character whoKick, Character whoIsKicked){
        if (whoKick.getPower() > whoIsKicked.getPower()){
            whoIsKicked.setHp(0);
        }
        else{
            whoIsKicked.reducePower(1);;
        }
    }

    @Override
    public String message(int damage, Character whoKick, Character whoIsKicked) {
        if (damage == 0){
            return new String("Sly elf sees that " + whoIsKicked + " is no weaker than him, therefore he decided to tire his opponent. " + "Enemy "+ whoIsKicked +"'s power was reduced by 1.");
        }
        return new String("Elf kicks the enemy " + whoIsKicked + " to death, they were no match for his power.");
    }
    
}
