public class GestionRanking {
    private Nodo cabeza;

    // 1. Inserción (Registrar puntaje al final de la lista)
    public void registrarPuntaje(String nombre, int puntaje) {
        Jugador nuevoJugador = new Jugador(nombre, puntaje);
        Nodo nuevoNodo = new Nodo(nuevoJugador);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevoNodo;
        }
    }

    // 2. Buscar Jugador (Búsqueda Lineal por nombre)
    public Jugador buscarJugador(String nombre) {
        Nodo aux = cabeza;
        while (aux != null) {
            if (aux.jugador.nombre.equalsIgnoreCase(nombre)) {
                return aux.jugador;
            }
            aux = aux.siguiente;
        }
        return null; // No encontrado
    }

    // 3. Ordenar Ranking (Burbuja: Mayor a Menor)
    public void ordenarRanking() {
        if (cabeza == null || cabeza.siguiente == null) return;

        boolean huboIntercambio;
        do {
            huboIntercambio = false;
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                if (actual.jugador.puntaje < actual.siguiente.jugador.puntaje) {
                    // Intercambio de objetos Jugador entre nodos
                    Jugador temp = actual.jugador;
                    actual.jugador = actual.siguiente.jugador;
                    actual.siguiente.jugador = temp;
                    huboIntercambio = true;
                }
                actual = actual.siguiente;
            }
        } while (huboIntercambio);
    }

    // --- Ejercicios de Aplicación ---

    public int encontrarValorMaximo() {
        if (cabeza == null) return -1;
        int max = cabeza.jugador.puntaje;
        Nodo aux = cabeza.siguiente;
        while (aux != null) {
            if (aux.jugador.puntaje > max) max = aux.jugador.puntaje;
            aux = aux.siguiente;
        }
        return max;
    }

    public int contarNodos() {
        int contador = 0;
        Nodo aux = cabeza;
        while (aux != null) {
            contador++;
            aux = aux.siguiente;
        }
        return contador;
    }

    public void buscarRepetidos() {
        Nodo i = cabeza;
        while (i != null) {
            Nodo j = i.siguiente;
            while (j != null) {
                if (i.jugador.puntaje == j.jugador.puntaje) {
                    System.out.println("Valor repetido encontrado: " + i.jugador.puntaje +
                            " (Jugadores: " + i.jugador.nombre + " y " + j.jugador.nombre + ")");
                }
                j = j.siguiente;
            }
            i = i.siguiente;
        }
    }

    public Jugador encontrarNodoMedio() {
        if (cabeza == null) return null;
        Nodo lento = cabeza;
        Nodo rapido = cabeza;
        // Técnica del puntero rápido y lento
        while (rapido != null && rapido.siguiente != null) {
            lento = lento.siguiente;
            rapido = rapido.siguiente.siguiente;
        }
        return lento.jugador;
    }

    public void mostrarLista() {
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.println(aux.jugador);
            aux = aux.siguiente;
        }
    }
}
