package Ejercicio5;

public class Cliente {
    public static void main(String[] args) {

        String romano="I III V IX";

        NonTerminal parcer = new NonTerminal(romano);
        String interpretado= parcer.interpretar();

        System.out.println("ROMANO:"+romano);
        System.out.println("ENTERO:" + interpretado);
    }
}
