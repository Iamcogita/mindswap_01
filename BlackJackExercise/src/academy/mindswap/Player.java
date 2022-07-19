package academy.mindswap;

public class Player {

    private int handCounter;
    private String name;

    public Player (String name) {
        this.name = name ;
        this.handCounter = 0 ;
    }
    public String getName() {
        return name;
    }
    public int getHandCounter() {
        return handCounter ;
    }
    public int sumHandCounter(int addCard) {
        return handCounter = handCounter + addCard ;
    }
}
