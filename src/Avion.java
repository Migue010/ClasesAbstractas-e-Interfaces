// Clase concreta que implementa la interfaz y extiende la clase abstracta
class Avion extends Vehiculo implements Volar {
    public Avion(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println(marca + " está rodando por la pista.");
    }

    @Override
    public void despegar() {
        System.out.println(marca + " está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println(marca + " está aterrizando.");
    }
}
