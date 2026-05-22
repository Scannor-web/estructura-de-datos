import java.time.LocalDateTime; // Para poder trabajar con las fechas de visita

// Esta es la clase principal que simula nuestro historial de navegación.
// Es como el jefe de la estación de tren, que sabe dónde está el primer vagón y qué hacer con ellos.
public class HistorialNavegacion {
    private Nodo cabeza; // La 'cabeza' es el primer nodo de nuestra lista enlazada. Es como la locomotora del tren.
    private int tamano; // Para saber cuántas páginas tenemos en el historial.

    // Constructor del historial. Cuando lo creamos, está vacío.
    public HistorialNavegacion() {
        this.cabeza = null; // Al principio no hay ningún vagón, así que la cabeza es nula
        this.tamano = 0; // Y el tamaño es cero
    }

    // Método para insertar una nueva página visitada.
    // ¡Esto es como añadir un nuevo vagón al principio del tren!
    public void insertarPagina(String url) {
        PaginaVisitada nuevaPagina = new PaginaVisitada(url); // Creamos la información de la nueva página
        Nodo nuevoNodo = new Nodo(nuevaPagina); // Creamos un nuevo vagón con esa información

        if (cabeza == null) {
            // Si el historial está vacío (no hay vagones),
            // este nuevo vagón se convierte en la cabeza del tren.
            cabeza = nuevoNodo;
        } else {
            // Si ya hay vagones, ponemos el nuevo vagón al principio.
            // El nuevo vagón apunta al que antes era la cabeza, y el nuevo vagón se convierte en la nueva cabeza.
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        }
        tamano++; // Aumentamos el contador de páginas en el historial
        System.out.println("Página insertada: " + url);
    }

    // Método para buscar páginas visitadas que contengan un texto en su URL.
    // Es como buscar en todos los vagones si alguno lleva una página con cierta palabra.
    public void buscarPaginas(String textoBusqueda) {
        if (cabeza == null) {
            System.out.println("El historial está vacío. No hay nada que buscar.");
            return;
        }

        System.out.println("Buscando páginas con \"" + textoBusqueda + "\":");
        Nodo actual = cabeza; // Empezamos a buscar desde la cabeza del tren
        boolean encontrada = false; // Una bandera para saber si encontramos algo

        while (actual != null) {
            // Si la URL de la página en el vagón actual contiene el texto que buscamos (ignorando mayúsculas/minúsculas)
            if (actual.pagina.getUrl().toLowerCase().contains(textoBusqueda.toLowerCase())) {
                System.out.println("- " + actual.pagina); // La imprimimos
                encontrada = true; // Y marcamos que sí encontramos algo
            }
            actual = actual.siguiente; // Pasamos al siguiente vagón
        }

        if (!encontrada) {
            System.out.println("No se encontraron páginas con \"" + textoBusqueda + "\".");
        }
    }

    // Método para eliminar todo el historial.
    // ¡Esto es como desenganchar todos los vagones y dejar el tren vacío!
    public void eliminarTodoElHistorial() {
        cabeza = null; // Simplemente hacemos que la cabeza apunte a nulo, y Java se encargará de borrar los vagones viejos
        tamano = 0; // El tamaño vuelve a ser cero
        System.out.println("Todo el historial ha sido eliminado.");
    }

    // Método para mostrar todo el historial.
    // Es como recorrer todos los vagones y ver qué página lleva cada uno.
    public void mostrarHistorial() {
        if (cabeza == null) {
            System.out.println("El historial está vacío.");
            return;
        }

        System.out.println("\n--- Historial de Navegación ---");
        Nodo actual = cabeza; // Empezamos desde la cabeza
        while (actual != null) {
            System.out.println(actual.pagina); // Imprimimos la página del vagón actual
            actual = actual.siguiente; // Pasamos al siguiente vagón
        }
        System.out.println("------------------------------");
    }

    // Método para obtener el tamaño actual del historial.
    public int getTamano() {
        return tamano;
    }
}
