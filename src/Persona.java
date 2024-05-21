import java.util.Date;

public class Persona {
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private Genero genero;
    private DIreccion direccionCasa;
    Telefono telefono;

    // Constructor
    public Persona(String nombre, String apellidos, Date fechaNacimiento, Genero genero, DIreccion direccionCasa, Telefono telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccionCasa = direccionCasa;
        this.telefono = telefono;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public DIreccion getDireccionCasa() {
        return direccionCasa;
    }

    public void setDireccionCasa(DIreccion direccionCasa) {
        this.direccionCasa = direccionCasa;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public class Telefono {
    }

    private class Direccion {
    }

    public class Genero {
    }
}

