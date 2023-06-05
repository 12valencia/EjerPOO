public class Main {
    public static void main(String[] args) {// Crear instancias de la clase "Carro"
        Carro carro1 = new Carro("Mercedes", "Corolla", 2022, "Roja");
        Carro carro2 = new Carro("Bugatty", "Civic", 2023, "Blanco");

        // Llamar a los métodos de cada instancia
        carro1.acelerar();
        carro1.frenar();
        carro1.girar("izquierda");
        carro1.mostrarInformacion();

        System.out.println();

        carro2.acelerar();
        carro2.frenar();
        carro2.girar("derecha");
        carro2.mostrarInformacion();

    }
}