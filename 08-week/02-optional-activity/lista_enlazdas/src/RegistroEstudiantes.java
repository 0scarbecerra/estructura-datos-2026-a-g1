import java.util.Scanner;
public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Nodo cabeza = null;
        Nodo temporal = null;

        System.out.println("--- Registro de 4 Estudiantes ---");

        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese el nombre del estudiante " + i + ": ");
            String nombre = sc.nextLine();

            // Creamos el nuevo nodo (esto es memoria dinámica)
            Nodo nuevoNodo = new Nodo(nombre);

            if (cabeza == null) {
                // Si es el primero, lo marcamos como la cabeza
                cabeza = nuevoNodo;
                temporal = cabeza;
            } else {
                // Enlazamos el nodo anterior con el nuevo
                temporal.siguiente = nuevoNodo;
                // Movemos el puntero temporal al último nodo creado
                temporal = nuevoNodo;
            }
        }

        // Recorrido para mostrar la lista y verificar la estructura
        System.out.println("\nEstructura de la Lista Enlazada:");
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print("[" + actual.nombre + " | Enlace]──► ");
            actual = actual.siguiente;
        }
        System.out.println("NULL");

        sc.close();
    }
}