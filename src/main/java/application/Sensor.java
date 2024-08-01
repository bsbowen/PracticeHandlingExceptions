package application;

// Interface for Sensor
public interface Sensor {

    // Returns true if the sensor is on
    boolean isOn();

    // Sets the sensor on
    void setOn();

    // Sets the sensor off
    void setOff();

    // Returns the value of the sensor if it's on
    // If the sensor is not on throw an IllegalStateException
    int read();
}