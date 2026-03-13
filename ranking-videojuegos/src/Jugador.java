public class Jugador {
    private String nombre;
    private String tipo;
    private int posicion;

    //Constructores
    public Jugador(String nombre, String tipo, int posicion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.posicion = posicion;
    }


    //Getters and Setters

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
