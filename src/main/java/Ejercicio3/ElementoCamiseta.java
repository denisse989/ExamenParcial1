package Ejercicio3;

public class ElementoCamiseta implements IElementos {
    private String precio;
    private String tamano;
    private String color;

    public ElementoCamiseta() {
    }

    public String getPrecio() { return precio; }
    public void setPrecio(String precio) { this.precio = precio; }

    public String getTamano() { return tamano; }
    public void setTamano(String tamano) { this.tamano = tamano; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public void crear() {
        System.out.println("*****************");
        System.out.println("Tamano: "+tamano);
        System.out.println("Color: "+color);
        System.out.println("Precio: "+precio);
        System.out.println(" ");
    }
}
