public class MeasuringInstrument {
    protected float maxVal;
    protected float minVal;
    protected float value;

    public MeasuringInstrument(float val) {
        this.value = val;
        this.maxVal = val;
        this.minVal = val;
    }

    public void newMeasurement(float newVal) {
        this.value = newVal;
        if (newVal > this.maxVal) {
            this.maxVal = newVal;
        } else if (newVal < this.minVal) {
            this.minVal = newVal;
        }
    }

    public float getValue() {
        return this.value;
    }

    public float getMaxValue() {
        return this.maxVal;
    }

    public float getMinValue() {
        return this.minVal;
    }

    public String toString() {
        return "current = " + value
                + ", min = " + minVal
                + ", max = " + maxVal;
    }

    public void reset() {
        this.maxVal = this.value;
        this.minVal = this.value;
    }

}
