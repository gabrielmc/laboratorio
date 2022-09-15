package factoryAdidas;

import interfaces.ITshirt;

/**
 * @author G Muniz
 */
public class TshirtAdidas implements ITshirt{

    @Override
    public void doTshirt() {
        System.out.println("Adidas - Tshirt blue created");
    }
}