public class Bear {
    private String speak = "I love You!" ;
    private int batConsumption ;
    private int batteryLevel = 100 ;

    Bear(){}

    Bear(int batConsumption){this.batConsumption = batConsumption ;}

    public void speak(){
        if (this.batteryLevel <= 0 ) {
            return;
        }
        System.out.println( speak );
        this.batDecreasing( batConsumption );
    }

    public void batDecreasing(int consumption){ batteryLevel -= consumption; }

    public int getBatteryLevel() {return batteryLevel;}
}
