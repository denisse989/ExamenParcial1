package Ejercicio3;

public class CreatorElementoPelotaDeFutbol extends CreatorElemento{
    @Override
    public ElementoPelotaDeFutbol create() {
        ElementoPelotaDeFutbol elementoPelotaDeFutbol =new ElementoPelotaDeFutbol();
        elementoPelotaDeFutbol.setColor("Rojo");
        elementoPelotaDeFutbol.setTamano("15cm");
        elementoPelotaDeFutbol.setGarantia("1 año");
        elementoPelotaDeFutbol.setPrecio("");

        return elementoPelotaDeFutbol;
    }
}
