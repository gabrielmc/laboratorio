package factoryNike;

import interfaces.IPants;

/**
 * @author Gmuniz
 */
public class PantsNike implements IPants{

    @Override
    public void doPants() {
        System.out.println("Nike - Pants red created");
    }
}