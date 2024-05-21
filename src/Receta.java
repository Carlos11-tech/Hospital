public class Receta {
    private String id;
    private String descripcion;
    private Doctor doctor;
    private Paciente paciente;

    // Constructor
    public Receta(String id, String descripcion, Doctor doctor, Paciente paciente) {
        this.id = id;
        this.descripcion = descripcion;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
}

