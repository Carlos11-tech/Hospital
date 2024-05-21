import java.util.List;

public class Hospital {
    private String nombre;
    private DIreccion direccion;
    private Telefono telefono;
    private List<Persona> personas;
    private Farmacia farmacia;

    // Constructor
    public Hospital(String nombre, DIreccion direccion, Telefono telefono, List<Persona> personas, Farmacia farmacia) {
        this.nombre = nombre;
        this.dIreccion = direccion;
        this.telefono = telefono;
        this.personas = personas;
        this.farmacia = farmacia;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DIreccion getDireccion() {
        return direccion;
    }

    public void setDireccion(DIreccion direccion) {
        this.direccion = direccion;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }
}


