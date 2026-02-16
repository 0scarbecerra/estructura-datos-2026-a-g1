# taller 1 - Estructura de datos

## aplicacion: videojuego resident evil 4

### Datos:

**Inventario de leon** – armas, munición, hierbas, objetos clave, dinero (pesetas).

**Enemigos (Los ganados)** – posición, salud, estado (patrullando, alerta, atacando), variante (hacha, dinamita, perro).

**Mapa y objetos interactivos** – áreas del pueblo, castillo, isla; cofres, máquinas de escribir, comerciante.

## Organización:

**Inventario:** Matriz bidimensional (rejilla de 8x8 o similar) que representa el maletín. Cada celda guarda el ítem o está vacía. Los ítems ocupan un tamaño en celdas. Se usa una tabla hash para buscar rápidamente objetos por tipo (ej. "hierba roja").

**Enemigos:** Lista enlazada o array dinámico de entidades activas en la zona actual. Cada enemigo es un objeto con atributos y una máquina de estados (comportamiento). Para ataques en grupo, se usan árboles de decisión.

**Mapa**: Grafo de zonas (nodos: pueblo, iglesia, lago) con caminos (aristas: puertas, puentes). Cada nodo contiene una lista de objetos interactivos (cofres, trampas) y sus estados (abierto/cerrado).
