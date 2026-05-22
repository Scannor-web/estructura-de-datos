import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("--- Sistema de Historial de Navegación ---");

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Insertar nueva página visitada");
            System.out.println("2. Buscar páginas visitadas");
            System.out.println("3. Mostrar todo el historial");
            System.out.println("4. Eliminar todo el historial");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la URL de la página: ");
                    String url = scanner.nextLine();
                    historial.insertarPagina(url);
                    break;
                case 2:
                    System.out.print("Ingrese el término de búsqueda: ");
                    String query = scanner.nextLine();
                    historial.buscarPaginas(query);
                    break;
                case 3:
                    historial.mostrarHistorial();
                    break;
                case 4:
                    historial.eliminarHistorial();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
