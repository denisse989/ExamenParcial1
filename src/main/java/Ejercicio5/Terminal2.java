package Ejercicio5;

public class Terminal2 extends AbstractNumero {
    public Terminal2() {
    }

    @Override
    public void interpreter(ContextNumeroRomano context) {
        if (context.input.startsWith("II")) {
            context.output=context.output+"2 ";
            context.input = context.input.substring(2);
        }

    }

}
