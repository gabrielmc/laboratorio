package factoryNike;

import interfaces.IShoes;

/**
 * @author Gmuniz
 */
public class ShoesNike implements IShoes{

    @Override
    public void doShoes() {
        System.out.println("Nike - Shoes red created");
    }
}