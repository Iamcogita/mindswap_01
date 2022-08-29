public class Cranky extends Bear {

    private int batConsumption ;
    private final String speakLoud = "I Love you!!!";
    private final String speakSoft = "....... ohh.... danny boy... " ;
    private boolean lowBat = false;

    Cranky(int batConsumption ) {
        super(batConsumption);
        this.batConsumption = batConsumption;
    }

    @Override
    public void speak () {
        if (getBatteryLevel() <= 0 ) {
            return;
        }
        if (getBatteryLevel() >= 50 ) {
            System.out.println(speakLoud);
            this.batDecreasing(batConsumption);
            return;
        }
        if (getBatteryLevel() < 50 && !lowBat){
            System.out.println(speakSoft);
            this.batDecreasing(batConsumption);
            lowBat = true;
        }
    }
}

