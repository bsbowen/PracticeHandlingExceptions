package application;

// Main class to run the program
public class Program {

    // Main method to run the program
    public static void main(String[] args) {

        // Create a TemperatureSensor for Kumpula
        Sensor kumpula = new TemperatureSensor();

        // Turn on the Kumpula sensor
        kumpula.setOn();

        // Print the temperature reading from the Kumpula sensor
        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        // Create a TemperatureSensor for Kaisaniemi
        Sensor kaisaniemi = new TemperatureSensor();

        // Create a TemperatureSensor for Helsinki Vantaa Airport
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        // Create an AverageSensor for the Helsinki region
        AverageSensor helsinkiRegion = new AverageSensor();

        // Add the Kumpula sensor to the Helsinki region sensor
        helsinkiRegion.addSensor(kumpula);

        // Add the Kaisaniemi sensor to the Helsinki region sensor
        helsinkiRegion.addSensor(kaisaniemi);

        // Add the Helsinki Vantaa Airport sensor to the Helsinki region sensor
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        // Turn on all sensors in the Helsinki region
        helsinkiRegion.setOn();

        // Print the average temperature reading from the Helsinki region sensor
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    }
}