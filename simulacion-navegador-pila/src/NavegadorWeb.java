import java.util.Stack;

// Clase principal que simula un navegador web utilizando una pila (Stack) para el historial de navegación.
public class NavegadorWeb {

    // Declaración de una pila (Stack) para almacenar las URLs de las páginas visitadas.
    // Stack es una clase de Java que implementa una estructura de datos LIFO (Last In, First Out).
    private Stack<String> historialPaginas;

    // Constructor de la clase NavegadorWeb.
    public NavegadorWeb() {
        // Inicializa la pila cuando se crea una nueva instancia del navegador.
        historialPaginas = new Stack<>();
    }

    /**
     * Simula la visita a una nueva página web.
     * La página se añade a la parte superior de la pila.
     * @param url La URL de la página a visitar.
     */
    public void visitarPagina(String url) {
        // Empuja (push) la URL de la nueva página a la pila.
        // Esto significa que la página actual se convierte en la última en entrar.
        historialPaginas.push(url);
        System.out.println("Visitando: " + url);
    }

    /**
     * Simula la acción de retroceder en el navegador.
     * Elimina la página actual de la parte superior de la pila y devuelve la anterior.
     * Si la pila está vacía, no hay páginas a las que retroceder.
     * @return La URL de la página anterior, o null si no hay páginas en el historial.
     */
    public String retroceder() {
        // Verifica si la pila no está vacía antes de intentar retroceder.
        if (!historialPaginas.empty()) {
            // Elimina (pop) la página actual de la pila.
            // Esta es la operación LIFO: el último elemento añadido es el primero en salir.
            String paginaAnterior = historialPaginas.pop();
            System.out.println("Retrocediendo de: " + paginaAnterior);
            // Después de retroceder, la nueva página actual es la que está en la cima de la pila.
            return paginaAnterior;
        } else {
            System.out.println("No hay páginas anteriores en el historial.");
            return null;
        }
    }

    /**
     * Consulta la página web actual sin eliminarla del historial.
     * @return La URL de la página actual, o null si la pila está vacía.
     */
    public String obtenerPaginaActual() {
        // Verifica si la pila no está vacía antes de intentar obtener la página actual.
        if (!historialPaginas.empty()) {
            // Devuelve (peek) la página en la cima de la pila sin eliminarla.
            // Esto nos permite ver la página actual sin modificar el historial.
            return historialPaginas.peek();
        } else {
            System.out.println("El historial de navegación está vacío.");
            return null;
        }
    }

    // Método main para probar la funcionalidad del navegador.
    public static void main(String[] args) {
        // Crea una nueva instancia de nuestro navegador web.
        NavegadorWeb navegador = new NavegadorWeb();

        // Simula la visita a varias páginas.
        navegador.visitarPagina("https://www.google.com");
        navegador.visitarPagina("https://www.gemini.google.com");
        navegador.visitarPagina("https://www.youtube.com");

        // Muestra la página actual.
        System.out.println("Página actual: " + navegador.obtenerPaginaActual()); // Debería ser youtube.com

        // Simula retroceder en el historial.
        navegador.retroceder(); // Retrocede de youtube.com
        System.out.println("Página actual después de retroceder: " + navegador.obtenerPaginaActual()); // Debería ser gemini.google.com

        navegador.retroceder(); // Retrocede de gemini.google.com
        System.out.println("Página actual después de retroceder: " + navegador.obtenerPaginaActual()); // Debería ser google.com

        navegador.retroceder(); // Retrocede de google.com
        System.out.println("Página actual después de retroceder: " + navegador.obtenerPaginaActual()); // Debería ser null (historial vacío)

        navegador.retroceder(); // Intenta retroceder con el historial vacío.
    }
}
