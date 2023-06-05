public class Carro {
    private String marca;
    private String modelo;
    private int anio;

    private String color;


    //constructor

    public Carro(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    // Getters y Setters
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // Métodos
    public void acelerar() {
        System.out.println("El carro está acelerando.");
    }

    public void frenar() {
        System.out.println("El carro está frenando.");
    }

    public void girar(String direccion) {
        System.out.println("El carro está girando hacia " + direccion + ".");
    }

    public void mostrarInformacion() {
        System.out.println("Información de los carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);
    }

}
