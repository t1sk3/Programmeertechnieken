public class Barometer extends MeasuringInstrument {

    public Barometer(float val) {
        super(val);
    }

    public float divergenceFromNorm() {
        return this.value - 1013;
    }
}