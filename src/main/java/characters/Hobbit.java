package characters;

import kickstrategy.HobbitStrategy;

public class Hobbit extends Character{
    
    public Hobbit(){
        super(3, 0, new HobbitStrategy());
    }


    @Override
    public String toString() {
        return "Hobbit";
    }
    
}
