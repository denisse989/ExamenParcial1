package Ejercicio3;

public class ElementoTenis implements IElementos{
    private String precio;
    private String tamano;
    private String color;

    public ElementoTenis() {
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
        System.out.println("Tamaño: "+ tamano);
        System.out.println("Color: "+color);
        System.out.println("Precio: "+precio);
        System.out.println(" ");

    }
}
