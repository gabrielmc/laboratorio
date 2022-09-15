package FiatFactory;

import interfaces.IPneu;

public class PneuFiat implements IPneu {

    private double polegadas;
    
    public PneuFiat(double polegada) {
        this.polegadas = polegada;
    }

    @Override
    public IPneu createPneu(double polegadas) {
        return new PneuFiat(polegadas);
    }
    
    @Override
    public String toString(){
        return "Pimensao: "+this.polegadas;
    }
}
