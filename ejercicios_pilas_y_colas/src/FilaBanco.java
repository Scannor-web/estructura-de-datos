import java.util.LinkedList;
import java.util.Queue;

public class FilaBanco {
    public static void main(String[] args) {
        // En Java, las colas se definen así:
        Queue<String> cola = new LinkedList<>();

        // Operación: Agregar cliente (Enqueue)
        System.out.println("Llega: Ana");
        cola.add("Ana");

        System.out.println("Llega: Carlos");
        cola.add("Carlos");

        // Operación: Mostrar siguiente (Peek) - Solo mira el primero sin sacarlo
        System.out.println("Siguiente en fila: " + cola.peek());

        // Operación: Atender cliente (Poll/Dequeue) - Saca al primero de la fila
        if (!cola.isEmpty()) {
            String atendido = cola.poll();
            System.out.println("Resultado -> Atendiendo: " + atendido);
        }

        // Verificamos quién quedó
        System.out.println("Ahora el siguiente es: " + cola.peek());
    }
}