package ej9;

import java.util.Random;

/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
public class servi9 {
    Matematica objeto = new Matematica();
    Random aleatoriamente = new Random();

    public Matematica Numeros() {
        System.out.println("Se asigna el primer numero aleatoriamente");
        objeto.setNum1(aleatoriamente.nextInt(10 - 1));
        System.out.println("Se asigna el segundo numero aleatoriamente");
        objeto.setNum2(aleatoriamente.nextInt(10 - 1));
        return objeto;
    }

    public void devolverMayor() {
        if (objeto.getNum1() > objeto.getNum2()) {
            System.out.println("El numero " + objeto.getNum1() + " es mayor al numero " + objeto.getNum2());
        } else if (objeto.getNum1() < objeto.getNum2()) {
            System.out.println("El numero " + objeto.getNum1() + " es menor al numero " + objeto.getNum2());
        } else {
            System.out.println("El numero " + objeto.getNum1() + " es igual al numero " + objeto.getNum2());
        }
    }

    public void calcularPotencia() {
        if (objeto.getNum1() > objeto.getNum2()) {
            System.out.println("La potencia da: " + ((int) Math.pow(objeto.getNum1(), objeto.getNum2())));
        } else if (objeto.getNum1() < objeto.getNum2()) {
            System.out.println("La potencia da: " + (int) Math.pow(objeto.getNum2(), objeto.getNum1()));
        } else {
            System.out.println(("Ambos numeros son iguales y la potencia da "
                    + (int) Math.pow(objeto.getNum1(), objeto.getNum2())));
        }
    }

    public void calculaRaiz() {
        System.out.println("Se calcula la raiz cuadrada del numero menor");
        Math.abs(objeto.getNum1());
        Math.abs(objeto.getNum2());
        if (objeto.getNum1() > objeto.getNum2()) {
            System.out.println("La raiz da: " + Math.sqrt(objeto.getNum2()));
        } else if (objeto.getNum1() < objeto.getNum2()) {
            System.out.println("La raiz da: " + Math.sqrt(objeto.getNum1()));
        } else {
            System.out.println(("Ambos numeros son iguales y la raiz da" + Math.sqrt(objeto.getNum2())));

        }

    }
}
