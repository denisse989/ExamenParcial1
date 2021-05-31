package Ejercicio4;

public class Comensal {
    private BuilderParrilla builderParrilla;
    public void setBuilderParrilla(BuilderParrilla builderParrilla){
        this.builderParrilla=builderParrilla;
    }
    public Parrillas getParrillas(){
        return builderParrilla.getParrillas();
    }

    public void prepararParrilla() {
        this.builderParrilla.createParrillas();
        this.builderParrilla.buildTipoDeCarne();
        this.builderParrilla.buildGuarniciones();
        this.builderParrilla.buildSaborRefresco();
    }

}
