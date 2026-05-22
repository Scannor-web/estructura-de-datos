import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PaginaWeb {
    private String url;
    private LocalDateTime fechaVisita;

    public PaginaWeb(String url) {
        this.url = url;
        this.fechaVisita = LocalDateTime.now();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getFechaVisita() {
        return fechaVisita;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "URL: " + url + " | Fecha: " + fechaVisita.format(formatter);
    }
}
