public class Drunk extends Bear {

    private final String sleep = " ..ZZZZ.....ZZZZZ....";
    Drunk() {super();}

    @Override
    public void speak(){
        if ( chanceToFallAsleep() == 2 ) {
            System.out.println(sleep);
            return;
        }
        System.out.println("I Love You!!");
    }

    public int chanceToFallAsleep(){
        return (int) ((Math.random() *  5) + 1 ) ;
    }
}
