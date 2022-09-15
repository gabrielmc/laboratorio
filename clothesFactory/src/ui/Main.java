package ui;

import interfaces.center.ClothesFactory;
import factoryAdidas.center.FactoryAdidas;
import factoryNike.center.FactoryNike;
import interfaces.*;

/**
 * @author Gmuniz
 */
public class Main {
    public static ITshirt tshirt;
    public static IPants pants;
    public static IShoes shoes;

    public static void main(String[] args){
        System.out.println("Factory 1");
        createClothes(new FactoryNike());
        System.out.println("\n");
        System.out.println("Factory 2");
        createClothes(new FactoryAdidas());
    }
    
    public static void createClothes(ClothesFactory clothes){
        tshirt = clothes.createTshirt();
        tshirt.doTshirt();
        pants = clothes.createPants();
        pants.doPants();
        shoes = clothes.createShoes();
        shoes.doShoes();
    }
}