public class HistorialNavegacion {
    private Nodo cabeza;
    private int tamano;

    public HistorialNavegacion() {
        this.cabeza = null;
        this.tamano = 0;
    }

    // Insertar una nueva página visitada (al inicio para que sea el historial más reciente)
    public void insertarPagina(String url) {
        PaginaWeb nuevaPagina = new PaginaWeb(url);
        Nodo nuevoNodo = new Nodo(nuevaPagina);
        
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
        }
        tamano++;
        System.out.println("Página añadida: " + url);
    }

    // Buscar páginas visitadas por URL (parcial o total)
    public void buscarPaginas(String query) {
        if (cabeza == null) {
            System.out.println("El historial está vacío.");
            return;
        }

        System.out.println("Resultados de búsqueda para: '" + query + "'");
        Nodo actual = cabeza;
        boolean encontrado = false;
        while (actual != null) {
            if (actual.getDato().getUrl().toLowerCase().contains(query.toLowerCase())) {
                System.out.println(actual.getDato());
                encontrado = true;
            }
            actual = actual.getSiguiente();
        }

        if (!encontrado) {
            System.out.println("No se encontraron coincidencias.");
        }
    }

    // Eliminar todo el historial
    public void eliminarHistorial() {
        cabeza = null;
        tamano = 0;
        System.out.println("Historial eliminado por completo.");
    }

    // Mostrar todo el historial
    public void mostrarHistorial() {
        if (cabeza == null) {
            System.out.println("El historial está vacío.");
            return;
        }

        System.out.println("--- Historial de Navegación ---");
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
        System.out.println("-------------------------------");
    }

    public int getTamano() {
        return tamano;
    }
}
