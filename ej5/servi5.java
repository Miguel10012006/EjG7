package ej5;

import java.util.Scanner;

/*c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
public class servi5 {
    Scanner leer = new Scanner(System.in);
    ejer5 objeto = new ejer5();
    int saldoTotal;

    public ejer5 crearCuenta() {
        long largo;
        largo = 0;
        System.out.println("Ingrese el numero de cuenta ");
        objeto.setCuenta(leer.nextInt());

        System.out.println("Ingrese el dni");
        objeto.setDni(leer.nextLong());
        largo = Long.toString(objeto.getDni()).length();
        do {

            System.out.println("Ingrese el dni");
            objeto.setDni(leer.nextLong());
            largo = Long.toString(objeto.getDni()).length();
        } while (largo != 10);

        System.out.println("Ingrese el saldo");
        objeto.setSaldo(leer.nextInt());
        return objeto;
    }

    public void elegir() {
        int opcion;
        do {
            System.out.println("Elije una opcion");
            System.out.println("1. Ingresar");
            System.out.println("2. Retirar");
            System.out.println("3.Extraccion Rapida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar datos");
            System.out.println("6. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Ingresar();
                    break;
                case 2:
                    Retirar();
                    break;
                case 3:
                    Rapido();
                    break;
                case 4:
                    Saldo1();
                    break;
                case 5:
                    Datos();
                    break;
                case 6:
                    System.out.println("El proceso ha terminado");
                    break;
            }
        } while (opcion != 6);
    }

    public void Ingresar() {
        int dinero;
        System.out.println("Ingrese el saldo que desea depositar");
        dinero = leer.nextInt();
        objeto.setSaldo(dinero + objeto.getSaldo());
    }

    public void Retirar() {
        int retiro;
        do {
            System.out.println("Ingrese la cantidad de dinero que desea retirar");
            retiro = leer.nextInt();
            if (retiro > objeto.getSaldo()) {
                System.out.println("El dinero que deseas retirar no está disponible");
            }
        } while (retiro > objeto.getSaldo());
        objeto.setSaldo(objeto.getSaldo() - retiro);
    }

    public void Rapido() {
        int retiro;
        do {
            System.out.println("Ingrese la cantidad que desea retirar");
            System.out.println("Solo puede retirar el 20%");
            retiro = leer.nextInt();
            if (retiro > objeto.getSaldo() * 0.20) {
                System.out.println("Solo puede retirar el 20%");
            }

        } while (retiro > objeto.getSaldo() * 0.20);
        objeto.setSaldo(objeto.getSaldo() - retiro);
    }

    public void Saldo1() {
        System.out.println("Su saldo es: " + objeto.getSaldo());
    }

    public void Datos() {
        System.out.println("Su numero de cuenta es: " + objeto.getCuenta());
        System.out.println("Su dni es: " + objeto.getDni());
        System.out.println("Su saldo es: " + objeto.getSaldo());
    }
}
