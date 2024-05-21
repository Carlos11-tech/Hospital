import java.util.Date;

public class Paciente extends Persona {
    private static final Genero genero = null;
    private final HistoriaMedica enfermedad;
    private String alergias;
    private final Telefono telefonoPaciente;
    private String id;
    private EstadoPaciente estadoPaciente;

    // Constructor
    public <genero> Paciente(String nombre, String apellidos, Date fechaNacimiento, genero, Genero femenino, DIreccion direccionCasa,  Telefono telefonoPaciente, String id, HistoriaMedica enfermedad, String alergias, EstadoPaciente estadoPaciente) {
        super(nombre, apellidos, fechaNacimiento, genero, direccionCasa, telefono);
        genero = femenino;
        this.telefonoPaciente = telefonoPaciente;
        this.id = id;
        this.enfermedad = enfermedad;
        this.alergias = alergias;
        this.estadoPaciente = estadoPaciente;
    }

    public Paciente(String ana, String gómez, Date fechaNacimiento, Genero genero, DIreccion direccionPaciente, Telefono telefonoPaciente, String p001, HistoriaMedica historiaMedica, String ninguna, EstadoPaciente estadoPaciente, HistoriaMedica enfermedad, String alergias, Telefono telefonoPaciente1) {
        super();
        this.enfermedad = enfermedad;
        this.alergias = alergias;
        this.telefonoPaciente = telefonoPaciente1;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public EstadoPaciente getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(EstadoPaciente estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public String mostrarHistorialMedico() {
        return alergias.toString();
    }
}

