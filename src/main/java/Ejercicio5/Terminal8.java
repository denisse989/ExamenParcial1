package Ejercicio5;

public class Terminal8 extends AbstractNumero {
    public Terminal8() {
    }

    @Override
    public void interpreter(ContextNumeroRomano context) {
        if (context.input.startsWith("VIII")) {
            context.output=context.output+"8 ";
            context.input = context.input.substring(4);
        }

    }

}
