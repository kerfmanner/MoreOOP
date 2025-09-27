import characters.Character;

public class GameManager {
 
    static void fight(Character c1, Character c2){
        int move = 0;
        System.out.println("The fight between " + c1 + " and " + c2 + " starts now.");

        while (c1.isAlive() && c2.isAlive()) {
        if ((c1.getPower() == 0) && (c2.getPower() == 0)){
            System.out.println("Two peaceful creatures won't fight anymore, everyone stayed alive ;)");
            return;
        }
            if (move % 2 == 0){
                c1.kick(c2);
            }
            else{
                c2.kick(c1);
            }
            move+=1;
        }
        if (c1.isAlive()){
            System.out.println(c1 + " killed enemy " + c2);
        }
        else{
            System.out.println(c2 + " killed enemy " + c1);
        }
    }
}
