package ej3;

import java.util.Scanner;

/*d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
public class servi3 {
    Scanner leer = new Scanner(System.in);

    public ejer3 crearOperacion() {
        ejer3 objeto = new ejer3();
        System.out.println("Ingrese el primer numero");
        objeto.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segunfo numero");
        objeto.setNumero2(leer.nextInt());
        return objeto;
    }

    public void sumar(ejer3 objeto) {
        int resultado = objeto.getNumero1() + objeto.getNumero2();
        System.out.println("El resultado de la suma es: " + resultado);

    }

    public void restar(ejer3 objeto) {
        int resultado2 = objeto.getNumero1() - objeto.getNumero2();
        System.out.println("El resultado de la resta es: " + resultado2);

    }

    public void multiplicar(ejer3 objeto) {
        if (objeto.getNumero1() != 0 || objeto.getNumero2() != 0) {
            int resultado = objeto.getNumero1() * objeto.getNumero2();
            System.out.println("El resultado de la multiplicacion es: " + resultado);
        } else {
            System.out.println("La multiplicacion da cero");
        }

    }

    public void dividir(ejer3 objeto) {
        if (objeto.getNumero1() != 0 && objeto.getNumero2() != 0) {
            double resultado = objeto.getNumero1() / objeto.getNumero2();
            System.out.println("El resultado de la division es: " + resultado);
        } else if (objeto.getNumero1() == 0) {
            System.out.println("El resultado de la division es cero");
        } else {
            System.out.println("Error!!! No se puede dividir entre 0");
        }

    }

}
