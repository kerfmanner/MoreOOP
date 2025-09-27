package characters;
public class Hobbit extends ConstantPowerCharacter{
    
    public Hobbit(){
        this.setHp(3);
        this.setPower(0);
    }

    public void kick(Character other){
        toCry();
    }

    private void toCry(){
        System.out.println("Hobbit cannot kick enemy because his legs are too small. Hobbit is crying.");
    }

    @Override
    public String toString() {
        return "Hobbit";
    }
    
}
