public class Janken {
    private static final int rock = 1 ;
    private static final int paper = 2 ;
    private static final int scissors = 3 ;
    private String name;

    private int score;

    public Janken(String name){
        this.name = name ;
    }
    public String getName() { return name ; }

    public int getThrow() {
        int randomThrow = (int) (Math.random() *  3 ) + 1 ;

        if (randomThrow == 1) {
            return score = rock ;
        }
        if (randomThrow == 2) {
            return score = paper ;
        }
        if (randomThrow == 3) {
            return score = scissors;
        }

        return this.score;
    }
    public int getScore() {
        return score ; }
}