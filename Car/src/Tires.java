public class Tires {

    private int integrity;

    public Tires() {
        integrity = 10;
    }

    public void tireWare() {
        integrity--;
        if (integrity <= 0) {
            System.out.println("Tire Exploded. ERR");
            Radio.turnOnRadio();
            changeTire();
        }

    }

    public void changeTire() {
        integrity = 20;
        System.out.println("Tire Changed.");

    }

    public int getIntegrity() {
        return integrity;
    }

}
