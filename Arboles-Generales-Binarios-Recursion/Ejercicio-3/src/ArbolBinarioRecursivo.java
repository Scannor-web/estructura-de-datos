public class ArbolBinarioRecursivo {

    // Función recursiva para contar nodos
    public static int contarNodos(NodoBinario nodo) {
        if (nodo == null) {
            return 0; // Caso base: si el nodo es nulo, no hay nodos
        }
        // Caso recursivo: 1 (por el nodo actual) + nodos en subárbol izquierdo + nodos en subárbol derecho
        return 1 + contarNodos(nodo.izquierda) + contarNodos(nodo.derecha);
    }

    // Función recursiva para calcular la altura del árbol
    public static int altura(NodoBinario nodo) {
        if (nodo == null) {
            return -1; // Caso base: la altura de un árbol vacío es -1
        }
        // Caso recursivo: 1 (por el nivel actual) + el máximo de las alturas de los subárboles
        return 1 + Math.max(altura(nodo.izquierda), altura(nodo.derecha));
    }

    public static void main(String[] args) {
        // Construcción del árbol binario (el mismo del Ejercicio 2)
        NodoBinario raiz = new NodoBinario(8);
        raiz.izquierda = new NodoBinario(3);
        raiz.derecha = new NodoBinario(10);

        raiz.izquierda.izquierda = new NodoBinario(1);
        raiz.izquierda.derecha = new NodoBinario(6);

        raiz.izquierda.derecha.izquierda = new NodoBinario(4);
        raiz.izquierda.derecha.derecha = new NodoBinario(7);

        raiz.derecha.derecha = new NodoBinario(14);
        raiz.derecha.derecha.izquierda = new NodoBinario(13);

        System.out.println("Cantidad de nodos: " + contarNodos(raiz));
        System.out.println("Altura del árbol: " + altura(raiz));
    }
}
