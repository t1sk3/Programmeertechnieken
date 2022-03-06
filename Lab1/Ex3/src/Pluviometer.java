public class Pluviometer extends MeasuringInstrument {
    float total;

    public Pluviometer(float val) {
        super(val);
        this.total = val;
    }

    @Override
    public void newMeasurement(float newVal) {
        this.total += newVal;
        super.newMeasurement(newVal);
    }

    public float getTotalRainMeasured() {
        return total;
    }
}
