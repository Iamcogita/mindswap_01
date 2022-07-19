public class Car {
    private Engine engine;
    private Tires tires;
    private Radio radio;

    private int distance;

    public Car() {
        this.engine = new Engine();
        this.tires = new Tires();
        this.radio = new Radio();

    }

    Tires tire = new Tires();

    public void accelerate(int fuel) {
        for (int i = 0; i < fuel; i++) {
            int distance = engine.generateEnergy(1);

            if (distance > 0) {
                System.out.println(" vroom, vroom ");
                System.out.println(" vroom, vroom ");
                System.out.print(engine.getFuelLevel() + " fuel left. ");
                System.out.print(tires.getIntegrity() + " tire integrity. ");
                tires.tireWare();
            }
            if (this.engine.getFuelLevel() <= 0) {
                System.out.println(" not enough fuel ");
                getRefuelled();
            }
        }
    }

    public int getDistance() {
        return distance;
    }

    public void getRefuelled() {
        engine.setFuelLevel();
        System.out.println("Refueled, full tank.");
    }
}
