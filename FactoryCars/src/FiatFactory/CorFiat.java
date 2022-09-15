package FiatFactory;

import interfaces.ICor;

public class CorFiat implements ICor {
    
    private String cor;
    
    public CorFiat(String cor) {
        this.cor = cor;
    }

    @Override
    public ICor createCor(String cor) {
        return new CorFiat(cor);
    }
    
    @Override
    public String toString(){
        return "Cor: "+this.cor;
    }
}
