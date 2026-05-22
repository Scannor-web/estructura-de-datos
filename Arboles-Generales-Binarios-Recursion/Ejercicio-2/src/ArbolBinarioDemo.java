public class ArbolBinarioDemo {

    public static void preorden(NodoBinario nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preorden(nodo.izquierda);
            preorden(nodo.derecha);
        }
    }

    public static void inorden(NodoBinario nodo) {
        if (nodo != null) {
            inorden(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            inorden(nodo.derecha);
        }
    }

    public static void postorden(NodoBinario nodo) {
        if (nodo != null) {
            postorden(nodo.izquierda);
            postorden(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }

    public static void main(String[] args) {
        // Construcción del árbol binario según la imagen sugerida en la guía
        // Raíz: 8
        NodoBinario raiz = new NodoBinario(8);
        raiz.izquierda = new NodoBinario(3);
        raiz.derecha = new NodoBinario(10);

        raiz.izquierda.izquierda = new NodoBinario(1);
        raiz.izquierda.derecha = new NodoBinario(6);

        raiz.izquierda.derecha.izquierda = new NodoBinario(4);
        raiz.izquierda.derecha.derecha = new NodoBinario(7);

        raiz.derecha.derecha = new NodoBinario(14);
        raiz.derecha.derecha.izquierda = new NodoBinario(13);

        System.out.println("Recorrido Preorden:");
        preorden(raiz);
        System.out.println();

        System.out.println("Recorrido Inorden:");
        inorden(raiz);
        System.out.println();

        System.out.println("Recorrido Postorden:");
        postorden(raiz);
        System.out.println();
    }
}
