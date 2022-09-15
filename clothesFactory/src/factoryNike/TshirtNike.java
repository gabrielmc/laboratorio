package factoryNike;

import interfaces.ITshirt;

/**
 * @author Gmuniz
 */
public class TshirtNike implements ITshirt {

    @Override
    public void doTshirt() {
        System.out.println("Nike - Tshirt red created");
    }   
}