import java.util.List;

public class Farmacia {
    private final Object medicamento = null;
    private String nombre;
    private DIreccion direccion;
    private Telefono telefono;
    private List<Medicamento> medicamento;

    // Constructor
    public <Medicamento> Farmacia(String nombre, DIreccion direccion, Telefono telefono, List<Medicamento> medicamentos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.medicamento = medicamento;
    }

    public Farmacia(String farmaciaCentral, DIreccion direccionFarmacia, Telefono telefonoFarmacia) {
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

    public List<Medicamento> getMedicamentos() {
        return medicamento;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamento = medicamentos;
    }

    private class Medicamento {
    }
}
