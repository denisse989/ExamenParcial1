package Ejercicio1;

public class Cliente {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoMatriculas singleton = PagoMatriculas.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(123);
                e.setNombre("Jose1");
                singleton.pagar(e, "4:00", 10000);
                singleton.showInfo();


            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoMatriculas singleton = PagoMatriculas.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(456);
                e.setNombre("Jose2");
                singleton.pagar(e, "5:00", 10010);
                singleton.showInfo();


            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoMatriculas singleton = PagoMatriculas.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(789);
                e.setNombre("Jose3");
                singleton.pagar(e, "4:50", 2000);
                singleton.showInfo();

            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoMatriculas singleton = PagoMatriculas.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(1011);
                e.setNombre("Jose4");
                singleton.pagar(e, "4:00", 10000);
                singleton.showInfo();


            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
