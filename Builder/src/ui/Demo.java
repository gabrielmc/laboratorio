package ui;

import factory.impl.CarBuilder;
import factory.impl.CarManualBuilder;
import models.Carro;
import models.Manual;
import services.Controlador;

/**
 * @author gmuniz
 */
public class Demo {
    
    public static void main(String[] args) {
        Controlador manager = new Controlador();
        CarBuilder builder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();
        
        
        
        //////////////////////////////////////////////////////////////////////
        ///////////////////////// FISRT TEST /////////////////////////////////
        //////////////////////////////////////////////////////////////////////
        
        manager.constructSUV(builder);
        manager.constructSUV(manualBuilder);
        
        Carro car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        
        //////////////////////////////////////////////////////////////////////
        ///////////////////////// SECOND TEST ////////////////////////////////
        //////////////////////////////////////////////////////////////////////
        manager.constructCityCar(builder);
        manager.constructCityCar(manualBuilder);
        
        Carro car2 = builder.getResult();
        System.out.println("Car built:\n" + car2.getCarType());
        
        Manual carManual3 = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual3.print());
    }
}