package Ejercicio5;

public class Terminal7 extends AbstractNumero {
    public Terminal7() {
    }

    @Override
    public void interpreter(ContextNumeroRomano context) {
        if (context.input.startsWith("VII")) {
            context.output=context.output+"7 ";
            context.input = context.input.substring(3);
        }

    }

}
