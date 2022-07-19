public class Player {
    private int numChosen ;
    private String name ;
    public Player(String name , int numChosen ) {
        this.name = name ;
        this.numChosen = numChosen ; }

    public String getName() { return name; }
    public int getNumChosen() { return numChosen; }
}