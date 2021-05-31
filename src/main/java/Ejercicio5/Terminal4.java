package Ejercicio5;

public class Terminal4 extends AbstractNumero {
    public Terminal4() {
    }

    @Override
    public void interpreter(ContextNumeroRomano context) {
        if (context.input.startsWith("IV")) {
            context.output=context.output+"4 ";
            context.input = context.input.substring(2);
        }

    }

}
