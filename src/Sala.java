public class Sala {
    private String id;
    private String nombre;
    private String descripcion;
    private int capacidad;
    private int cantidadPacientes;
    private boolean disponible;

    // Constructor
    public Sala(String id, String nombre, String descripcion, int capacidad, int cantidadPacientes, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.cantidadPacientes = cantidadPacientes;
        this.disponible = disponible;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantidadPacientes() {
        return cantidadPacientes;
    }

    public void setCantidadPacientes(int cantidadPacientes) {
        this.cantidadPacientes = cantidadPacientes;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
