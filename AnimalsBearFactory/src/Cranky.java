public class Cranky extends Bear {

    private int batConsumption ;
    private String speakLoud = "I Love you!!!";
    private String speakSoft = "....... ohh.... danny boy... " ;
    boolean lowBat = false;

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

