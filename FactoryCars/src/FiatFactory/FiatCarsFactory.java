package FiatFactory;

import interfaces.*;

public class FiatCarsFactory implements ICarsFactory{

    private IMotor motor;
    private IChassi chassi;
    private ICor cor;
    private IPneu pneu;
    
    private static FiatCarsFactory instance = null;
    
    private FiatCarsFactory(){
        this.chassi = new ChassiFiat(60, 15);
        this.cor = new CorFiat("Blue");
        this.motor = new MotorFiat("Style", 25, 1.4, 62.000);
        this.pneu = new PneuFiat(50);
    }
    
    public static FiatCarsFactory getInstance(){
        return (instance == null) ? instance = new FiatCarsFactory() : instance;
    }
    
    @Override
    public IMotor getMotor() {
        return this.motor;
    }

    @Override
    public IChassi getChassi() {
        return this.chassi;
    }

    @Override
    public ICor getCor() {
        return this.cor;
    }

    @Override
    public IPneu getPneu() {
        return this.pneu;
    }

}
