public class Nodo {
    private PaginaWeb dato;
    private Nodo siguiente;

    public Nodo(PaginaWeb dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public PaginaWeb getDato() {
        return dato;
    }

    public void setDato(PaginaWeb dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
