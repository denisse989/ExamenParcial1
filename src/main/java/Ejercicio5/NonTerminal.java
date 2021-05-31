package Ejercicio5;
import java.util.ArrayList;
import java.util.List;
public class NonTerminal extends AbstractNumero{


        private List<AbstractNumero> parseTree= new ArrayList<>();
        private ContextNumeroRomano context;

        public NonTerminal(String word){
            this.interpretecion(word);
        }

        public void interpretecion(String words) {
            String input = words;
            context= new ContextNumeroRomano(input.replace(" ",""));
            for (String word : input.split(" ")) {
                switch (word){
                    case "I":
                        parseTree.add(new Terminal1());
                        break;
                    case "II":
                        parseTree.add(new Terminal2());
                        break;
                    case "III":
                        parseTree.add(new Terminal3());
                        break;
                    case "IV":
                        parseTree.add(new Terminal4());
                        break;
                    case "V":
                        parseTree.add(new Terminal5());
                        break;
                    case "VI":
                        parseTree.add(new Terminal6());
                        break;
                    case "VII":
                        parseTree.add(new Terminal7());
                        break;
                    case "VIII":
                        parseTree.add(new Terminal8());
                        break;
                    case "IX":
                        parseTree.add(new Terminal9());
                        break;
                    case "X":
                        parseTree.add(new Terminal10());
                        break;

                    default:
                        break;
                }

            }
        }


        public String interpretar(){
            for (AbstractNumero terminalExpresion: parseTree) {
                terminalExpresion.interpreter(context);
            }
            return  context.output;
        }


    @Override
    public void interpreter(ContextNumeroRomano context) {

    }
}
