package Ejercicio3;

public class CreatorElementoTenis extends CreatorElemento{
    @Override
    public ElementoTenis create() {
        ElementoTenis elementoTenis =new ElementoTenis();
        elementoTenis.setColor("Rojo");
        elementoTenis.setTamano("37");
        elementoTenis.setPrecio("");
        return elementoTenis;
    }
}
