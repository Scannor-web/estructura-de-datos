// Esta es la clase principal donde vamos a probar nuestro Historial de Navegación.
// Es como el panel de control donde le damos órdenes al jefe de la estación de tren (HistorialNavegacion).
public class Principal {

    public static void main(String[] args) {
        System.out.println("¡Hola! Vamos a simular un historial de navegación.");

        // Creamos una nueva instancia de nuestro historial.
        // Es como si abriéramos un navegador por primera vez.
        HistorialNavegacion miHistorial = new HistorialNavegacion();

        // --- Paso 1: Insertar páginas visitadas ---
        System.out.println("\n--- Insertando páginas ---");
        miHistorial.insertarPagina("https://www.google.com");
        miHistorial.insertarPagina("https://www.youtube.com");
        miHistorial.insertarPagina("https://www.gemini.google.com");
        miHistorial.insertarPagina("https://www.wikipedia.org");
        miHistorial.insertarPagina("https://www.github.com");

        // --- Paso 2: Mostrar todo el historial ---
        miHistorial.mostrarHistorial();
        System.out.println("Tamaño actual del historial: " + miHistorial.getTamano());

        // --- Paso 3: Buscar páginas ---
        System.out.println("\n--- Buscando páginas ---");
        miHistorial.buscarPaginas("google"); // Buscamos algo que contenga "google"
        miHistorial.buscarPaginas("wiki");   // Buscamos algo que contenga "wiki"
        miHistorial.buscarPaginas("facebook"); // Buscamos algo que no existe

        // --- Paso 4: Insertar más páginas para ver el crecimiento dinámico ---
        System.out.println("\n--- Insertando más páginas ---");
        miHistorial.insertarPagina("https://www.stackoverflow.com");
        miHistorial.insertarPagina("https://www.reddit.com");
        miHistorial.mostrarHistorial();
        System.out.println("Tamaño actual del historial: " + miHistorial.getTamano());

        // --- Paso 5: Eliminar todo el historial ---
        System.out.println("\n--- Eliminando historial ---");
        miHistorial.eliminarTodoElHistorial();

        // --- Paso 6: Intentar mostrar el historial después de eliminarlo ---
        miHistorial.mostrarHistorial();
        System.out.println("Tamaño actual del historial: " + miHistorial.getTamano());

        System.out.println("\n¡Fin de la simulación del historial de navegación!");
    }
}
