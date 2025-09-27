package characters;
public class Elf extends ConstantPowerCharacter{
    
    public Elf(){
        this.setPower(10);
        this.setHp(10);
    }

    public void kick(Character other){
        if (this.getPower() > other.getPower()){
            other.setHp(0);

            System.out.println("Elf shoots the enemy " + other + " to death, they were no match for his power.");
        }
        else{
            other.setPower(other.getPower() - 1);
            System.out.println("Sly elf sees that " + other + " is no weaker than him, therefore he decided to tire his opponent. " + "Enemy "+ other +"'s power was reduced by 1.");
        }
    }

    @Override
    public String toString() {
        return "Elf";
    }
}
