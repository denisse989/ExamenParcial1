package Ejercicio5;

public class Terminal1 extends AbstractNumero {
    public Terminal1() {
    }

    @Override
    public void interpreter(ContextNumeroRomano context) {
        if (context.input.startsWith("I")) {
            context.output=context.output+"1 ";
            context.input = context.input.substring(1);
        }

    }

}
