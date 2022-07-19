public class Engine {

    private int range;
    private int fuelLevel;

    public Engine() {
        range = 10;
        fuelLevel = 50;
    }

    public int generateEnergy(int fuel) {
        int distance = fuel * range;
        fuelLevel -= fuel;
        return distance;
    }

    public void setFuelLevel() {
        this.fuelLevel = 50;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

}
