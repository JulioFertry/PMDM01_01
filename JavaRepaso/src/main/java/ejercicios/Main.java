package ejercicios;

public class Main {
    public static void main(String[] args) {
        Ejercicios.ej02();
        Ejercicios.ej04();
        Ejercicios.ej06();
    }

}


class Ejercicios {

    public static void ej02() {
        int energia = 80;
        String estado;

        if (energia > 50) {
            estado = "Personaje fuerte";
        } else {
            estado = "Personaje débil";
        }

        System.out.println(estado);
    }


    public static void ej04() {
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println("Número: " + i);
        }
    }


    public static void ej06() {
        String personaje = null;
        if (personaje != null) {
            System.out.println("El personaje es " + personaje);
        } else {
            System.out.println("No hay personaje");
        }

    }

}