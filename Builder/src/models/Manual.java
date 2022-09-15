package models;

import factory.components.*;
import models.enums.*;

/**
 * @author gmuniz
 */
public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        info += "Trip Computer: " + "\n";
        info += (this.tripComputer != null) ? "Functional" + "\n" : "N/A" + "\n";
        info += "GPS Navigator: " + "\n";
        info += (this.tripComputer != null) ? "Functional" + "\n" : "N/A" + "\n";
        return info;
    }
}