import java.util.LinkedList;
import java.util.Queue;

// Clase principal que simula una impresora utilizando la interfaz Queue y la implementación LinkedList.
// Esto representa una estructura FIFO (First In, First Out).
public class ImpresoraNativa {

    // Declaración de una cola (Queue) para almacenar los documentos a imprimir.
    // LinkedList es una implementación común de Queue que permite añadir y remover elementos eficientemente.
    private Queue<String> colaImpresion;

    // Constructor de la clase ImpresoraNativa.
    public ImpresoraNativa() {
        // Inicializa la cola cuando se crea una nueva instancia de la impresora.
        colaImpresion = new LinkedList<>();
    }

    /**
     * Agrega un documento a la cola de impresión.
     * Los documentos se añaden al final de la cola.
     * @param documento El nombre o identificador del documento a imprimir.
     */
    public void agregarDocumento(String documento) {
        // offer() es el método preferido para añadir elementos a una cola.
        // Devuelve 'true' si el elemento se añadió correctamente, 'false' en caso contrario.
        colaImpresion.offer(documento);
        System.out.println("Documento agregado a la cola: " + documento);
    }

    /**
     * Procesa el siguiente documento en la cola de impresión.
     * Elimina el documento del frente de la cola (FIFO).
     * @return El documento procesado, o null si la cola está vacía.
     */
    public String procesarSiguienteDocumento() {
        // poll() recupera y elimina el encabezado de esta cola, o devuelve null si esta cola está vacía.
        // Esta es la operación FIFO: el primer elemento añadido es el primero en salir.
        String documentoAImprimir = colaImpresion.poll();
        if (documentoAImprimir != null) {
            System.out.println("Imprimiendo documento: " + documentoAImprimir);
        } else {
            System.out.println("La cola de impresión está vacía. No hay documentos para imprimir.");
        }
        return documentoAImprimir;
    }

    /**
     * Consulta el siguiente documento a imprimir sin eliminarlo de la cola.
     * @return El siguiente documento en la cola, o null si la cola está vacía.
     */
    public String verSiguienteDocumento() {
        // peek() recupera, pero no elimina, el encabezado de esta cola, o devuelve null si esta cola está vacía.
        // Esto nos permite ver cuál será el próximo documento sin modificar la cola.
        String siguiente = colaImpresion.peek();
        if (siguiente != null) {
            System.out.println("Siguiente documento en la cola: " + siguiente);
        } else {
            System.out.println("La cola de impresión está vacía.");
        }
        return siguiente;
    }

    /**
     * Verifica si la cola de impresión está vacía.
     * @return true si la cola está vacía, false en caso contrario.
     */
    public boolean estaVacia() {
        return colaImpresion.isEmpty();
    }

    // Método main para probar la funcionalidad de la impresora.
    public static void main(String[] args) {
        // Crea una nueva instancia de nuestra impresora.
        ImpresoraNativa impresora = new ImpresoraNativa();

        // Agrega varios documentos a la cola.
        impresora.agregarDocumento("Informe Anual.pdf");
        impresora.agregarDocumento("Presentacion Marketing.pptx");
        impresora.agregarDocumento("Factura_Cliente_001.docx");

        // Consulta el siguiente documento a imprimir.
        impresora.verSiguienteDocumento(); // Debería ser Informe Anual.pdf

        // Procesa documentos en orden de llegada.
        impresora.procesarSiguienteDocumento(); // Imprime Informe Anual.pdf
        impresora.verSiguienteDocumento();      // Debería ser Presentacion Marketing.pptx

        impresora.procesarSiguienteDocumento(); // Imprime Presentacion Marketing.pptx
        impresora.verSiguienteDocumento();      // Debería ser Factura_Cliente_001.docx

        impresora.procesarSiguienteDocumento(); // Imprime Factura_Cliente_001.docx
        impresora.verSiguienteDocumento();      // La cola debería estar vacía

        // Intenta procesar un documento con la cola vacía.
        impresora.procesarSiguienteDocumento();
    }
}
