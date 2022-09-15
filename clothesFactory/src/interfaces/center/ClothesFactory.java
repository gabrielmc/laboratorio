package interfaces.center;

import interfaces.IPants;
import interfaces.IShoes;
import interfaces.ITshirt;

/**
 * @author Gmuniz
 */
public interface ClothesFactory {
    
    public ITshirt createTshirt();
    public IPants createPants();
    public IShoes createShoes();
}