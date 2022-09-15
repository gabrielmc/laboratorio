package factoryAdidas.center;

import factoryAdidas.PantsAdidas;
import factoryAdidas.ShoesAdidas;
import factoryAdidas.TshirtAdidas;
import interfaces.center.ClothesFactory;
import interfaces.IPants;
import interfaces.ITshirt;
import interfaces.IShoes;

/**
 * @author G muniz
 */
public class FactoryAdidas implements ClothesFactory{

    @Override
    public ITshirt createTshirt() {
        return new TshirtAdidas();
    }

    @Override
    public IPants createPants() {
        return new PantsAdidas();
    }

    @Override
    public IShoes createShoes() {
        return new ShoesAdidas();
    }
}