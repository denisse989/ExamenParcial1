package Ejercicio1;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PagoMatriculas {
    private static PagoMatriculas instance = null;
    private Map<String, String> matriculas = new HashMap<String, String>();
    private Map<String, Integer> monto = new HashMap<String, Integer>();
    private List<Estudiante> estudiantes = new LinkedList<>();

    private PagoMatriculas() {
        System.out.println("INFO> Creando Singleton");
    }

    public static synchronized void makeInstance() {
        if (instance == null)
            instance = new PagoMatriculas();
    }

    public static synchronized PagoMatriculas getInstance() {
        if (instance == null)
            makeInstance();
        return instance;
    }

    public synchronized void pagar(Estudiante estudiante, String hora, int monto) {
        if (!matriculas.containsKey(estudiante.nombre)) {
            this.monto.put(estudiante.nombre, monto);
            estudiantes.add(estudiante);
        } else {
            this.monto.put(estudiante.nombre, monto+this.monto.get(estudiante.nombre));
        }
        matriculas.put(estudiante.nombre, "Hora: " + hora);

    }

    public synchronized void showInfo() {
        System.out.println("*****************");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre " + estudiante.nombre);
            System.out.println("Ci: " + estudiante.ci);
            System.out.println(matriculas.get(estudiante.nombre));
            System.out.println("Monto: "+monto.get(estudiante.nombre));
            System.out.println(" ");
        }
    }
}
