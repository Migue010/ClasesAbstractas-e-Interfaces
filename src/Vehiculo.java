// Clase abstracta que sirve como base para todos los vehículos

abstract class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public abstract void mover();  // Método abstracto

    public void detener() {
        System.out.println(marca + " se ha detenido.");
    }
}
