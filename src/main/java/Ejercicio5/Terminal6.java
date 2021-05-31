package Ejercicio5;

public class Terminal6 extends AbstractNumero {
    public Terminal6() {
    }

    @Override
    public void interpreter(ContextNumeroRomano context) {
        if (context.input.startsWith("VI")) {
            context.output=context.output+"6 ";
            context.input = context.input.substring(2);
        }

    }

}
