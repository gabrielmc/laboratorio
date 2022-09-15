package factoryAdidas;

import interfaces.IShoes;

/**
 * @author GMuniz
 */
public class ShoesAdidas implements IShoes{

    @Override
    public void doShoes() {
        System.out.println("Adidas - Shoes blue created");
    }
}