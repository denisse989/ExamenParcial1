package Ejercicio5;

public class Terminal3 extends AbstractNumero {
    public Terminal3() {
    }

    @Override
    public void interpreter(ContextNumeroRomano context) {
        if (context.input.startsWith("III")) {
            context.output=context.output+"3 ";
            context.input = context.input.substring(3);
        }

    }

}
