package FiatFactory;

import interfaces.IChassi;

public class ChassiFiat implements IChassi {
    
    private int dimensao;
    private double espessura;
    
    public ChassiFiat(int dimensao, double espessura ) {
        this.dimensao = dimensao;
        this.espessura = espessura;
    }

    @Override
    public IChassi cheateChassi(int dimensao, double espessura) {
        return new ChassiFiat(dimensao, espessura);
    }
    
    @Override
    public String toString(){
        return "Dimensao: "+this.dimensao+"__Espessura: "+this.espessura;
    }
}
