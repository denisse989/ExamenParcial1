package Ejercicio5;

public class Terminal10 extends AbstractNumero {
    public Terminal10() {
    }

    @Override
    public void interpreter(ContextNumeroRomano context) {
        if (context.input.startsWith("X")) {
            context.output=context.output+"10 ";
            context.input = context.input.substring(1);
        }

    }

}
