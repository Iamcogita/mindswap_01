import java.util.ArrayList;
import java.util.List;

public class Shop {
    private int bearCounter = 0 ;
    public List<Bear> listOfProducedBears = new ArrayList<>();
    public Shop(){}
    public void makeThemSpeak(){listOfProducedBears.forEach(Bear::speak);}

    public void amountOfBearsToProduce(int amountOfBears , int batConsumption ){
        for (int i = 0; i < amountOfBears; i++) {
            produceBear( batConsumption );
        }
        System.out.println( bearCounter + " bears were produced.");
    }

    public int produceBear( int batConsumption ) {
        if (bearCounter % 5 == 0) {
            Bear produceCranky = new Cranky( batConsumption );
            produceCranky.speak();
            listOfProducedBears.add(produceCranky);
            System.out.print(" A Cranky Bear was produced. \n");
            return bearCounter ++ ;
        }
        if (bearCounter % 2 == 0) {
            Bear produceSimple = new Simple( batConsumption );
            produceSimple.speak();
            listOfProducedBears.add(produceSimple);
            System.out.print(" A Simple Bear was produced. \n");
            return bearCounter ++ ;
        }
        Bear produceDrunk = new Drunk();
        produceDrunk.speak();
        listOfProducedBears.add(produceDrunk);
        System.out.print(" A Drunk Bear was produced. \n");
        return bearCounter ++ ;
    }
}
