package ej4;

import java.util.Scanner;

public class servi4 {
    Scanner leer = new Scanner(System.in);

    public ejer4 rectangulo() {
        int base = leer.nextInt();
        int altura = leer.nextInt();
        ejer4 objeto = new ejer4(base, altura);

        return objeto;

    }

    public void superficie(ejer4 objeto) {
        double superficie = objeto.getAltura() * objeto.getBase();
        System.out.println("La superficie del rectangulo es: " + superficie);
    }

    public void perimetro(ejer4 objeto) {
        double peri = (objeto.getBase() + objeto.getAltura()) * 2;
        System.out.println("El perimetro del rectangulo es: " + peri);
    }

    public void dibujar(ejer4 objeto) {
        for (int i = 0; i < objeto.getAltura(); i++) {
            for (int j = 0; j < objeto.getBase(); j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
