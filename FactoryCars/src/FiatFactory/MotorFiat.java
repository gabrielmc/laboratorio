package FiatFactory;

import interfaces.IMotor;

public class MotorFiat implements IMotor {
    
    private String modelo;
    private int tamanho;
    private double potencia;
    private double custo;
    
    public MotorFiat(String modelo, int tamanho, double potencia, double custo) {
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.potencia = potencia;
        this.custo = custo;
    }

    @Override
    public IMotor createMotor(String modelo, int tamanho, double potencia, double custo) {
        return new MotorFiat(modelo, tamanho, potencia, custo);
    }
    
    @Override
    public String toString(){
        return "Modelo: "+this.modelo+"__Tamanho: "+this.tamanho+"__Potencia: "+this.potencia+"__Custo: "+this.custo;
    }

}
