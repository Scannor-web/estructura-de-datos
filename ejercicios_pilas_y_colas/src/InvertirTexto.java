import java.util.Stack;

public class InvertirTexto {
    public static void main(String[] args) {
        String entrada = "JAVA";

        // Creamos la pila
        Stack<Character> pila = new Stack<>();

        // Paso 1: Metemos cada letra en la pila
        for (char letra : entrada.toCharArray()) {
            pila.push(letra);
        }

        // Paso 2: Sacamos las letras. La última en entrar ('A') sale primero.
        StringBuilder salida = new StringBuilder();
        while (!pila.isEmpty()) {
            salida.append(pila.pop());
        }

        System.out.println("Entrada -> " + entrada);
        System.out.println("Salida  -> " + salida.toString());
    }
}