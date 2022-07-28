public class Bear {

    private int batConsumption ;
    private String speak = "I love You!" ;
    private int batteryLevel = 100 ;

    Bear(){}

    public void speak(){
        if (this.batteryLevel <= 0 ) {
            return;
        }
        System.out.println( speak );
        this.batDecreasing(batConsumption);
    }

    public void batDecreasing(int batConsumption){ batteryLevel = batteryLevel - batConsumption ; }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
