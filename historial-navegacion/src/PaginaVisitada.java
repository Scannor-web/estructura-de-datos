import java.time.LocalDateTime; // Necesitamos esto para guardar la fecha y hora de la visita

// Esta es la clase que representa una página que visitamos en internet.
// Piensa en ella como una tarjeta de información para cada sitio web.
public class PaginaVisitada {
    private String url; // Aquí guardaremos la dirección web, como "https://www.google.com"
    private LocalDateTime fechaVisita; // Aquí guardaremos cuándo visitamos esa página, con fecha y hora exactas

    // Este es el "constructor". Es como la receta para crear una nueva PaginaVisitada.
    // Cuando creamos una, le tenemos que decir cuál es la URL.
    public PaginaVisitada(String url) {
        this.url = url; // Guardamos la URL que nos dieron
        this.fechaVisita = LocalDateTime.now(); // Y automáticamente ponemos la fecha y hora de ahora mismo
    }

    // Este método nos permite obtener la URL de la página.
    // Es como preguntar a la tarjeta: "¿Cuál es tu dirección web?"
    public String getUrl() {
        return url;
    }

    // Este método nos permite obtener la fecha y hora de la visita.
    // Es como preguntar a la tarjeta: "¿Cuándo te visitaron?"
    public LocalDateTime getFechaVisita() {
        return fechaVisita;
    }

    // Este método es especial. Nos ayuda a ver la información de la página de forma bonita.
    // Cuando imprimimos un objeto PaginaVisitada, esto es lo que se mostrará.
    @Override
    public String toString() {
        return "URL: " + url + ", Visitada el: " + fechaVisita; // Por ejemplo: "URL: google.com, Visitada el: 2023-10-27T10:30:00"
    }
}
