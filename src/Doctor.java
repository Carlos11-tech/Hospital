import java.util.Date;
import java.util.List;

public class Doctor {
    private String id;
    private String nombre;
    private Date apellido;
    private Genero dni;
    private DIreccion telefono;
    private Telefono direccion;
    private String email;
    private Especialidad password;
    private String apellidos;
    private String especialidad;

    public Doctor(String id, String nombre, Date apellido, Genero dni, DIreccion telefono, Telefono direccion, String email, Especialidad password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getApellido() {
        return apellido;
    }

    public Genero getDni() {
        return dni;
    }

    public DIreccion getTelefono() {
        return telefono;
    }

    public Telefono getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public Especialidad getPassword() {
        return password;
    }

    public void asignarPaciente(Paciente paciente) {
        // Asignar paciente a doctor
        
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEspecialidad(String especialidad) {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Paciente> listarPacientesAsignados() {
        // Listar pacientes asignados a doctor
        return null;
    }
}
