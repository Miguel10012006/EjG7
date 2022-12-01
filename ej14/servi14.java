package ej14;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/*Una tienda que vende teléfonos móviles quiere tener registro de cada producto que posee en un sistema computacional.Para ello,crearemos un programa donde se pueda almacenar cada producto con su información.Crear una entidad Movil con los atributos marca,precio,modelo,memoriaRam,almacenamiento y codigo.El atributo código será un arreglo numérico de dimensión 7(siete)donde cada subíndice alojará un número correspondiente al código. A continuación,se implementarán los siguientes métodos:Un constructor por defecto.Un constructor con todos los atributos como parámetro.Métodos getters y setters de cada atributo.Método cargarCelular():se solicita al usuario que ingrese los datos necesarios para instanciar un objeto Celular y poder cargarlo en nuestro programa.Método ingresarCodigo():este método permitirá ingresar el código completo de siete números de un celular.Para ello,puede utilizarse un bucle repetitivo*/
public class servi14 {
    Scanner leer = new Scanner(System.in);
    DecimalFormat DC = new DecimalFormat("###,###,###.00");

    public ejer14 cargarCelular() {
        ejer14 objeto = new ejer14();
        System.out.println("Ingrese la marca del movil");
        objeto.setMarca(leer.nextLine());
        System.out.println("Ingrese el modelo del movil");
        objeto.setModelo(leer.next());
        System.out.println("Ingrese el precio del movil");
        objeto.setPrecio(leer.nextDouble());
        System.out.println("Ingrese la ram del movil");
        objeto.setRam(leer.nextInt());
        System.out.println("Ingrese el almacenamiento");
        objeto.setAlmacenamiento(leer.nextInt());
        return objeto;
    }

    public void ingresarCodigo(ejer14 objeto) {
        int vector[] = new int[7];
        int codigo = 0;
        for (int i = 0; i < objeto.getCodigo().length; i++) {
            do {
                System.out.println("Ingrese el digito del movil numero" + (i + 1));
                codigo = leer.nextInt();
                if (codigo > 9 || codigo < 0)
                    System.out.println("Ingrese un digito de una sola cifra en la posicion numero " + (i + 1));

            } while (codigo > 9 || codigo < 0);
            vector[i] = codigo;
        }
        objeto.setCodigo(vector);

    }

    public void mostrarDator(ejer14 objeto) {
        System.out.println();
        System.out.println("La marca del movil es: " + objeto.getMarca());
        System.out.println("El modelo del movil es: " + objeto.getModelo());
        System.out.println("El precio del movil es: " + DC.format(objeto.getPrecio()));
        System.out.println("La ram del movil es: " + objeto.getRam());
        System.out.println("EL almacenamiento del movil es: " + objeto.getAlmacenamiento() + "GB");
        System.out.println("El codigo del movil es: " + Arrays.toString(objeto.getCodigo()));
    }
}
