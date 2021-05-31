package Ejercicio3;

public class Cliente {
    public static void main(String[] args) {
    ElementoCamiseta elementoCamiseta=new  CreatorElementoCamiseta().create();
    elementoCamiseta.setPrecio("50bs");
    elementoCamiseta.crear();

    ElementoMedias elementoMedias=new CreatorElementoMedias().create();
    elementoMedias.setPrecio("20bs");
    elementoMedias.crear();

    ElementoPelotaDeFutbol elementoPelotaDeFutbol=new CreatorElementoPelotaDeFutbol().create();
    elementoPelotaDeFutbol.setPrecio("100bs");
    elementoPelotaDeFutbol.crear();

    ElementoShort elementoShort=new CreatorElementoShort().create();
    elementoPelotaDeFutbol.setPrecio("30bs");
    elementoPelotaDeFutbol.crear();

    ElementoTenis elementoTenis=new CreatorElementoTenis().create();
    elementoTenis.setPrecio("150bs");
    elementoTenis.crear();
    }
}
