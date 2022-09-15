package run;

import FiatFactory.FiatCarsFactory;
import interfaces.*;

public class AppTest {

    private IChassi chassi;
    private ICor cor;
    private IMotor motor;
    private IPneu pneu;
    
    public void createFactory(ICarsFactory factory){
        this.chassi = factory.getChassi();
        this.chassi.toString();
        
        this.motor = factory.getMotor();
        this.motor.toString();
        
        this.cor = factory.getCor();
        this.cor.toString();
        
        this.pneu = factory.getPneu();
        this.pneu.toString();
    }
    
    public static void main(String[] args) {
        AppTest test = new AppTest();
        test.createFactory(FiatCarsFactory.getInstance());
    }
}
