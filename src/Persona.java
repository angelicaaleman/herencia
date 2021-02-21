public class Persona

{


    private final String nombre;
    private final String apellido;
    private final long  id;

    public Persona(String nombre, String apellido, long id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApllido() {
        return apellido;
    }

    public long getId() {
        return id;
    }
}
