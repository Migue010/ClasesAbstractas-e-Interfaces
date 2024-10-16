// Clase concreta que hereda de la clase abstracta y no implementa la interfaz

class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    @Override
    public void mover() {
        System.out.println(marca + " está conduciendo en la carretera.");
    }
}