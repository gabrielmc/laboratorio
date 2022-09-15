package factoryNike.center;

import factoryNike.PantsNike;
import factoryNike.ShoesNike;
import factoryNike.TshirtNike;
import interfaces.center.ClothesFactory;
import interfaces.IPants;
import interfaces.ITshirt;
import interfaces.IShoes;

/**
 * @author Gmuniz
 */
public class FactoryNike implements ClothesFactory{

    @Override
    public ITshirt createTshirt() {
        return new TshirtNike();
    }

    @Override
    public IPants createPants() {
        return new PantsNike();
    }

    @Override
    public IShoes createShoes() {
        return new ShoesNike();
    }
}