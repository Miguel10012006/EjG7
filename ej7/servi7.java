package ej7;

import java.util.Scanner;
//- mr.robot

public class servi7 {

    Scanner leer = new Scanner(System.in);

    public ejer7[] crearPersona(ejer7 objeto[]) {
        System.out.println("Longitud del array" + objeto.length);

        for (int i = 0; i < 4; i++) {
            objeto[i] = new ejer7(nom(), ed(), sex(), alt(), peso());
            objeto[i].setMayor(esMayorDeEdad(objeto[i]));
        }
        return objeto;
    }

    public String nom() {
        System.out.println("Ingrese el nombre");
        String nombre = leer.nextLine();
        return nombre;
    }

    public int ed() {
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        return edad;
    }

    public String sex() {
        String sexo;
        boolean sexoIncorrecto;
        do {
            System.out.println("Ingrese el sexo");
            leer.nextLine();
            sexo = leer.nextLine().toUpperCase();
            sexoIncorrecto = !sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O");
            if (sexoIncorrecto)
                System.out.println("Por favor ingrese un valor correcto");
        } while (sexoIncorrecto);
        return sexo;
    }

    public double alt() {
        System.out.println("Ingrese la altura");
        double altura = leer.nextDouble();
        return altura;
    }

    public double peso() {
        System.out.println("Ingrese el peso");
        double peso = leer.nextDouble();
        leer.nextLine();
        return peso;
    }

    public void IMC(ejer7 objeto[]) {
        double indice;
        int cont1 = 0, cont2 = 0, cont3 = 0;
        for (int i = 0; i < 4; i++) {
            indice = objeto[i].getPeso() / Math.pow(objeto[i].getAltura(), 2);
            if (condImc(indice) == -1) {
                System.out.println(objeto[i].getNombre() + " está por debajo de su peso ideal");
                cont1 += 1;
            } else if (condImc(indice) == 1) {
                System.out.println(objeto[i].getNombre() + " está por encima de su peso ideal");
                cont2 += 1;
            } else {
                System.out.println(objeto[i].getNombre() + " está en su peso ideal");
                cont3 += 1;
            }
        }
        mostrarPorcentajesP(cont1, cont2, cont3);
    }

    public int condImc(double indice) {
        if (indice < 20)
            return -1;
        else if (indice > 25)
            return 1;
        else
            return 0;
    }

    public void mayor(ejer7 objeto[]) {
        int cont4 = 0, cont5 = 0;
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {
            if (objeto[i].isMayor() == true) {
                System.out.println(objeto[i].getNombre() + " es mayor de edad");
                cont4 += 1;
            } else {
                System.out.println(objeto[i].getNombre() + " es menor de edad");
                cont5 += 1;
            }
        }
        mostrarPorcentajesM(cont4, cont5);
    }

    public boolean esMayorDeEdad(ejer7 objeto) {
        return objeto.getEdad() > 17;
    }

    public void mostrarPorcentajesP(int cont1, int cont2, int cont3) {
        System.out.println(
                "\nEl porcentaje de personas que estan debajo de su peso ideal es: " + (cont1 * 100) / 4 + "%");
        System.out.println("El porcentaje de personas que estan en su peso ideal es: " + (cont3 * 100) / 4 + "%");
        System.out.println(
                "El porcentaje de personas que estan por encima de su peso ideal es: " + (cont2 * 100) / 4 + "%");
    }

    public void mostrarPorcentajesM(int cont4, int cont5) {
        System.out.println("\nEl porcentaje de personas que son mayores de edad es: " + (cont4 * 100) / 4 + "%");
        System.out.println("El porcentaje de personas que son menores de edad es: " + (cont5 * 100) / 4 + "%");
    }
}
