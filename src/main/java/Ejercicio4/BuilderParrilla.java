package Ejercicio4;

public abstract class BuilderParrilla {
    protected Parrillas parrillas;

    public Parrillas getParrillas() {
        return parrillas;
    }

    public void createParrillas(){
        parrillas= new Parrillas();
    }

    public abstract void buildTipoDeCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();

}
