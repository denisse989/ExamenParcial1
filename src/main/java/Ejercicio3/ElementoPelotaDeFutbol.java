package Ejercicio3;

public class ElementoPelotaDeFutbol implements IElementos {
    private String precio;
    private String tamano;
    private String color;
    private String garantia;

    public ElementoPelotaDeFutbol() {
    }

    public String getPrecio() { return precio; }
    public void setPrecio(String precio) { this.precio = precio; }

    public String getTamano() { return tamano; }
    public void setTamano(String tamano) { this.tamano = tamano; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getGarantia() { return garantia; }
    public void setGarantia(String garantia) { this.garantia = garantia; }

    @Override
    public void crear() {
        System.out.println("*****************");
        System.out.println("Tamaño: "+ tamano);
        System.out.println("Color: "+color);
        System.out.println("Garantia: "+garantia);
        System.out.println("Precio: "+precio);
        System.out.println(" ");
    }
}
