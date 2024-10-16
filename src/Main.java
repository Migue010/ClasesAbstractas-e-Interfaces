public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota");
        miCoche.mover();
        miCoche.detener();

        // Creando un avión
        Avion miAvion = new Avion("Boeing 747");
        miAvion.mover();  // "Boeing 747 está rodando por la pista."
        miAvion.despegar();  // "Boeing 747 está despegando."
        miAvion.aterrizar();  // "Boeing 747 está aterrizando."
        miAvion.detener();  // "Boeing 747 se ha detenido."

        // Usando polimorfismo
        Vehiculo vehiculo = new Coche("Honda");
        vehiculo.mover();  // "Honda está conduciendo en la carretera."
        vehiculo.detener();  // "Honda se ha detenido."

        Vehiculo vehiculoVolador = new Avion("Airbus A320");
        vehiculoVolador.mover();  // "Airbus A320 está rodando por la pista."


    }
}