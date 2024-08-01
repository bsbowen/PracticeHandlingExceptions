package application;

// Class for StandardSensor
public class StandardSensor implements Sensor {

    // Value of the sensor
    private int value;

    // Constructor to initialize the value
    public StandardSensor(int value) {
        this.value = value;
    }

    // Method to check if the sensor is on (always true for StandardSensor)
    @Override
    public boolean isOn() {
        return true;
    }

    // Method to set the sensor on (no action needed for StandardSensor)
    @Override
    public void setOn() {
    }

    // Method to set the sensor off (no action needed for StandardSensor)
    @Override
    public void setOff() {
    }

    // Method to read the value of the sensor
    @Override
    public int read() {
        if (true) {
            return value;
        } else {
            throw new IllegalStateException("Illegal state!");
        }
    }
}