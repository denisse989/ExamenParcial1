package Ejercicio5;

public class Terminal5 extends AbstractNumero {
    public Terminal5() {
    }

    @Override
    public void interpreter(ContextNumeroRomano context) {
        if (context.input.startsWith("V")) {
            context.output=context.output+"5 ";
            context.input = context.input.substring(1);
        }

    }

}
