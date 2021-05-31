package Ejercicio3;

public class CreatorElementoShort extends CreatorElemento{
    @Override
    public ElementoShort create() {
        ElementoShort elementoShort =new ElementoShort();
        elementoShort.setColor("Rojo");
        elementoShort.setTamano("M");
        elementoShort.setPrecio("");
        return elementoShort;
    }
}
