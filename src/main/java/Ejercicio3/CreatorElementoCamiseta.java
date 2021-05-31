package Ejercicio3;

public class CreatorElementoCamiseta extends CreatorElemento{
    @Override
    public ElementoCamiseta create() {
        ElementoCamiseta elementoCamiseta=new ElementoCamiseta();
        elementoCamiseta.setColor("Rojo");
        elementoCamiseta.setTamano("m");
        elementoCamiseta.setPrecio("");
        return elementoCamiseta;
    }
}
