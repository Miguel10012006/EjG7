package ej14;

/*Una tienda que vende teléfonos móviles quiere tener registro de cada producto que posee en un sistema computacional.Para ello,crearemos un programa donde se pueda almacenar cada producto con su información.Crear una entidad Movil con los atributos marca,precio,modelo,memoriaRam,almacenamiento y codigo.El atributo código será un arreglo numérico de dimensión 7(siete)donde cada subíndice alojará un número correspondiente al código. A continuación,se implementarán los siguientes métodos:Un constructor por defecto.Un constructor con todos los atributos como parámetro.Métodos getters y setters de cada atributo.Método cargarCelular():se solicita al usuario que ingrese los datos necesarios para instanciar un objeto Celular y poder cargarlo en nuestro programa.Método ingresarCodigo():este método permitirá ingresar el código completo de siete números de un celular.Para ello,puede utilizarse un bucle repetitivo*/
public class ejer14 {
    private String marca;
    private String modelo;
    private double precio;
    private int ram;
    private int almacenamiento;
    private int codigo[] = new int[7];

    public ejer14(String marca, String modelo, double precio, int ram, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public ejer14() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

}
