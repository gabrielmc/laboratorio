package factoryAdidas;

import interfaces.IPants;

/**
 * @author G Muniz
 */
public class PantsAdidas implements IPants{

    @Override
    public void doPants() {
        System.out.println("Adidas - Pants blue created");
    }
}