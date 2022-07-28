

public class Shop {
    Simple simple = new Simple();
    Cranky cranky = new Cranky();
    Drunk drunk = new Drunk();

    private int bearCounter = 0 ;

    public void amountOfBearsToProduce(int amountOfBears , int batConsumption ){
        for (int i = 0; i < amountOfBears; i++) {
            produceBear( batConsumption );
        }
        System.out.println( bearCounter + " bears were produced.");
    }

    public int produceBear( int batConsumption ) {
        if (bearCounter % 5 == 0) {
            Bear produceCranky = new Cranky();
            this.cranky.speak();
            cranky.batDecreasing(batConsumption);
            //System.out.println("A Cranky Bear was produced with " + this.cranky.getBatteryLevel() + " battery level.");
            return bearCounter ++ ;
        }
        if (bearCounter % 2 == 0) {
            Bear produceSimple = new Simple();
            this.simple.speak();
            //System.out.println("A Simple Bear was produced with " + this.simple.getBatteryLevel() + " battery level.");
            simple.batDecreasing(batConsumption);
            return bearCounter ++ ;
        }
        Bear produceDrunk = new Drunk();
        this.drunk.speak();
        return bearCounter ++ ;
        //System.out.println("A Drunk Bear was produced.");
        //drunk.batDecreasing(batConsumption);
    }
}
