public class TestHistorial {
    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();

        System.out.println("--- Iniciando Pruebas ---");
        
        // 1. Probar inserción
        System.out.println("\n1. Probando inserción:");
        historial.insertarPagina("google.com");
        historial.insertarPagina("github.com");
        historial.insertarPagina("stackoverflow.com");
        historial.mostrarHistorial();

        // 2. Probar búsqueda
        System.out.println("\n2. Probando búsqueda (query: 'git'):");
        historial.buscarPaginas("git");

        // 3. Probar eliminación
        System.out.println("\n3. Probando eliminación total:");
        historial.eliminarHistorial();
        historial.mostrarHistorial();

        System.out.println("\n--- Pruebas Finalizadas ---");
    }
}
