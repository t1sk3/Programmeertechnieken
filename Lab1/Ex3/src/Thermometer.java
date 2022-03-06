public class Thermometer extends MeasuringInstrument {
    public char unit;

    public Thermometer(float val, char unit) {
        super(val);
        if (unit != 'C' && unit != 'F') {
            this.unit = 'C';
        } else {
            this.unit = unit;
        }
    }

    public char getUnit() {
        return this.unit;
    }

    @Override
    public String toString() {
        return "current = " + value + unit
                + ", min = " + minVal + unit
                + ", max = " + maxVal + unit;
    }
}
