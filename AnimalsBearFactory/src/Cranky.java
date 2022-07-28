public class Cranky extends Bear {

    private int batConsumption = getBatteryLevel();
    private String speakLoud = "I Love you!!!";
    private String speakSoft = "....... ohh.... danny boy... " ;
    private boolean lowBat = false ;

    Cranky( ) {
        super();
    }

    @Override
    public void speak () {
        if (getBatteryLevel() >= 50 ) {
            System.out.println(this.speakLoud);
            //this.batDecreasing(batConsumption);
            return;
        }
        if (getBatteryLevel() < 50 && !lowBat ){
            System.out.println(this.speakSoft);
            lowBat = true ;
        }
    }
}

