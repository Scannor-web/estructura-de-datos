public class Contacto {
    private String nombre;
    private String telefono;
    private String correo;

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
