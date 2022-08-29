public class Simple extends Bear {

    private int batConsumption;

    public Simple(int batConsumption) {
        super(batConsumption);
        this.batConsumption = batConsumption;
    }

    @Override
    public void batDecreasing(int consumption) {
        this.batConsumption = consumption;
        super.batDecreasing(this.batConsumption);
    }
}