package Ejercicio3;

public class CreatorElementoMedias extends CreatorElemento{
    @Override
    public ElementoMedias create() {
        ElementoMedias elementoMedias =new ElementoMedias();
        elementoMedias.setColor("Rojo");
        elementoMedias.setTamano("M");
        elementoMedias.setPrecio("");
        return elementoMedias;
    }
}
