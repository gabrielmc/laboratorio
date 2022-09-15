package factory.components;

import models.Carro;

/**
 * @author gmuniz
 */
public class TripComputer {
    
    private Carro car;

    public void setCar(Carro car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (!this.car.getEngine().isStarted()) {
            System.out.println("Car isn't started");
        } else {
            System.out.println("Car is started");
        }
    }
}
