// Esta es la clase 'Nodo'. Piensa en ella como un vagón de tren.
// Cada vagón lleva una 'PaginaVisitada' y sabe cuál es el siguiente vagón.
public class Nodo {
    PaginaVisitada pagina; // Aquí guardamos la información de la página web (nuestra 'PaginaVisitada')
    Nodo siguiente; // Aquí guardamos la referencia al siguiente 'Nodo' (el siguiente vagón de tren)

    // Este es el constructor del Nodo. Cuando creamos un vagón, le decimos qué página lleva.
    public Nodo(PaginaVisitada pagina) {
        this.pagina = pagina; // Guardamos la página que nos dieron
        this.siguiente = null; // Al principio, este vagón no está conectado a ningún otro, así que su 'siguiente' es nulo
    }
}
