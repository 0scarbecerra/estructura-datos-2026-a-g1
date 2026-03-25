// Definición de la clase Nodo
class Nodo {
    String nombre;
    Nodo siguiente;

    // Constructor para inicializar el nodo con el dato
    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null; // Por defecto el enlace apunta a null
    }
}