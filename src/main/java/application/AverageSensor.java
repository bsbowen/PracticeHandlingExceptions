package application;

import java.util.ArrayList;
import java.util.List;

// Class for AverageSensor
public class AverageSensor implements Sensor {

    // List to hold multiple sensors
    private ArrayList<Sensor> sensors;

    // List to hold readings from sensors
    private ArrayList<Integer> readings;

    // Constructor to initialize the lists
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    // Method to add a sensor to the list
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    // Method to check if all sensors are on
    @Override
    public boolean isOn() {
        for (Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    // Method to set all sensors on
    @Override
    public void setOn() {
        for (Sensor sensor: sensors) {
            sensor.setOn();
        }
    }

    // Method to set all sensors off
    @Override
    public void setOff() {
        for (Sensor sensor: sensors) {
            sensor.setOff();
        }
    }

    // Method to read the average value from all sensors
    @Override
    public int read() {
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("Sensor is off or no sensors added!");
        }
        int avg = this.sensors.stream().map(s -> s.read()).reduce(0, (prev, curr) -> prev + curr) / this.sensors.size();
        this.readings.add(avg);
        return avg;
    }

    // Method to get all readings
    public List<Integer> readings() {
        return this.readings;
    }
}