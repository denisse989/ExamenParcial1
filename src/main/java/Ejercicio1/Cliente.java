package Ejercicio1;

public class Cliente {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoMatriculas singleton = PagoMatriculas.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(123);
                e.setNombre("sdafe");
                singleton.pagar(e, "4:00", 10000);
                singleton.showInfo();
                System.out.println("*******");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoMatriculas singleton = PagoMatriculas.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(123);
                e.setNombre("gsg");
                singleton.pagar(e, "5:00", 1111);
                singleton.showInfo();
                System.out.println("*******");

            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoMatriculas singleton = PagoMatriculas.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(123);
                e.setNombre("aaaa");
                singleton.pagar(e, "4:56", 222);
                singleton.showInfo();
                System.out.println("*******");

            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoMatriculas singleton = PagoMatriculas.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(123);
                e.setNombre("sdafe");
                singleton.pagar(e, "4:00", 10000);
                singleton.showInfo();
                System.out.println("*******");

            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
