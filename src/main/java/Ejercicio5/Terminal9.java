package Ejercicio5;

public class Terminal9 extends AbstractNumero {
    public Terminal9() {
    }

    @Override
    public void interpreter(ContextNumeroRomano context) {
        if (context.input.startsWith("IX")) {
            context.output=context.output+"9 ";
            context.input = context.input.substring(2);
        }

    }

}
