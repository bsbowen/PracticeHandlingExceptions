package application;

import java.util.Random;

// Class for TemperatureSensor
public class TemperatureSensor implements Sensor {

    // Boolean to check if the sensor is on
    private boolean isOn;

    // Constructor to initialize the sensor state
    public TemperatureSensor() {
        this.isOn = false;
    }

    // Method to check if the sensor is on
    @Override
    public boolean isOn() {
        return isOn;
    }

    // Method to set the sensor on
    @Override
    public void setOn() {
        this.isOn = true;
    }

    // Method to set the sensor off
    @Override
    public void setOff() {
        this.isOn = false;
    }

    // Method to read the value of the sensor (random temperature)
    @Override
    public int read() {
        if (isOn) {
            return new Random().nextInt(61) - 30;
        } else {
            throw new IllegalStateException("Illegal state!");
        }
    }
}