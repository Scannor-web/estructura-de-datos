import java.util.ArrayList;

public class GestionContactos {
    private ArrayList<Contacto> lista;

    public GestionContactos() {
        lista = new ArrayList<>();
    }

    public void insertar(Contacto contacto){
        lista.add(contacto);
        System.out.println("Contacto agregado");
    }

    public Contacto buscar(String nombre){
        for (Contacto contacto: lista){
            if(contacto.getNombre().equalsIgnoreCase(nombre)){
                return contacto;
            }
        }
        return null;
    }

    public boolean eliminar(String nombre){
        Contacto contacto = buscar(nombre);
        if(contacto != null){
            return lista.remove(contacto);
        }
        return false;
    }

    public void listar(){
        for (Contacto contacto: lista){
            System.out.println(contacto);
        }
    }
}
