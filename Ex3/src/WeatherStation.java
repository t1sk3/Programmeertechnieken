import java.util.ArrayList;

public class WeatherStation {
    private ArrayList<MeasuringInstrument> instruments;

    public WeatherStation() {
        instruments = new ArrayList<MeasuringInstrument>();
    }

    public void newMeasurement(float... values) {
        if (values.length == instruments.size()) {
            for (int i = 0; i < instruments.size(); i++) {
                instruments.get(i).newMeasurement(values[i]);
            }
        }
    }

    public void addMeasuringInstrument(MeasuringInstrument instrument) {
        this.instruments.add(instrument);
    }

    public void reset() {
        for (MeasuringInstrument instrument : instruments) {
            instrument.reset();
        }
    }

    public void print() {
        for (MeasuringInstrument instrument : instruments) {
            System.out.println(instrument.toString());
        }
    }
}
