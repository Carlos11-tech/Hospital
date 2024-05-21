import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la dirección del hospital
        DIreccion direccionHospital = new DIreccion("Calle Principal", "Ciudad", "12345");

        // Crear una instancia del teléfono del hospital
        Telefono telefonoHospital = new Telefono("123-456-7890", "Principal");

        // Crear una lista de personas en el hospital
        List<Persona> personas = new ArrayList<>();

        // Crear una instancia de la farmacia del hospital
        DIreccion direccionFarmacia = new DIreccion("Avenida Secundaria", "Ciudad", "67890");
        Telefono telefonoFarmacia = new Telefono("098-765-4321", "Farmacia");
        Farmacia farmacia = new Farmacia("Farmacia Central", direccionFarmacia, telefonoFarmacia);

        // Crear una instancia del hospital
        Hospital hospital = new Hospital("Hospital General", direccionHospital, telefonoHospital, personas, farmacia);

        // Crear una instancia de un doctor
        DIreccion direccionDoctor = new DIreccion("Calle Terciaria", "Ciudad", "54321");
        Telefono telefonoDoctor = new Telefono("234-567-8901", "Doctor");
        Doctor doctor = new Doctor("Juan", "Pérez", new Date(), Genero.MASCULINO, direccionDoctor, telefonoDoctor, "D001", Especialidad.MEDICINA);

        // Crear una instancia de un paciente
        DIreccion direccionPaciente = new DIreccion("Calle Cuarta", "Ciudad", "67890");
        Telefono telefonoPaciente = new Telefono("345-678-9012", "Paciente");
        HistoriaMedica historiaMedica = new HistoriaMedica() {
            @Override
            public void agregarDiagnostico(String diagnostico) {

            }

            @Override
            public void agregarTratamiento(String tratamiento) {

            }

            @Override
            public void agregarMedicamento(String medicamento) {

            }

            @Override
            public void agregarReceta(String receta) {

            }

            @Override
            public void agregarFecha(String fecha) {

            }

            @Override
            public void agregarHora(String hora) {

            }

            @Override
            public void agregarEspecialidad(Especialidad especialidad) {

            }

            @Override
            public void agregarEstadoPaciente(EstadoPaciente estadoPaciente) {

            }

            @Override
            public void agregarGenero(Genero genero) {

            }

            @Override
            public void agregarFarmacia(Farmacia farmacia) {

            }

            @Override
            public void agregarMedico(String medico) {

            }

            @Override
            public void agregarPaciente(String paciente) {

            }

            @Override
            public void agregarEdad(int edad) {

            }

            @Override
            public void agregarPeso(double peso) {

            }

            @Override
            public void agregarAltura(double altura) {

            }

            @Override
            public void agregarPresionArterial(double presionArterial) {

            }

            @Override
            public void agregarTemperatura(double temperatura) {

            }

            @Override
            public void agregarFrecuenciaCardiaca(double frecuenciaCardiaca) {

            }

            @Override
            public void agregarFrecuenciaRespiratoria(double frecuenciaRespiratoria) {

            }

            @Override
            public void agregarSaturacionOxigeno(double saturacionOxigeno) {

            }

            @Override
            public void agregarAlergias(String alergias) {

            }

            @Override
            public void agregarAntecedentes(String antecedentes) {

            }

            @Override
            public void agregarObservaciones(String observaciones) {

            }

            @Override
            public void agregarSintomas(String sintomas) {

            }

            @Override
            public void agregarMotivoConsulta(String motivoConsulta) {

            }

            @Override
            public void agregarHistoriaFamiliar(String historiaFamiliar) {

            }

            @Override
            public void agregarHistoriaPersonal(String historiaPersonal) {

            }

            @Override
            public void agregarHistoriaMedica(String historiaMedica) {

            }

            @Override
            public void agregarHistoriaQuirurgica(String historiaQuirurgica) {

            }

            @Override
            public void agregarHistoriaObstetrica(String historiaObstetrica) {

            }

            @Override
            public void agregarHistoriaToxicologica(String historiaToxicologica) {

            }

            @Override
            public void agregarHistoriaPsicologica(String historiaPsicologica) {

            }

            @Override
            public void agregarHistoriaSocial(String historiaSocial) {

            }

            @Override
            public void agregarHistoriaLaboral(String historiaLaboral) {

            }

            @Override
            public void agregarHistoriaMedicamentos(String historiaMedicamentos) {

            }

            @Override
            public void agregarHistoriaAlergias(String historiaAlergias) {

            }

            @Override
            public void agregarHistoriaInmunizaciones(String historiaInmunizaciones) {

            }

            @Override
            public void agregarHistoriaExamenFisico(String historiaExamenFisico) {

            }

            @Override
            public void agregarHistoriaEstudios(String historiaEstudios) {

            }

            @Override
            public void agregarHistoriaTratamientos(String historiaTratamientos) {

            }

            @Override
            public String mostrarHistorialMedico() {
                return "" ;
            }
        };
        Paciente paciente = new Paciente("Ana", "Gómez", new Date(), Genero.FEMENINO, direccionPaciente, telefonoPaciente, "P001", historiaMedica, "Ninguna", EstadoPaciente.ESPERA);

        // Asignar paciente al doctor
        doctor.asignarPaciente(paciente);

        // Agregar el doctor y paciente a la lista de personas en el hospital
        personas.add(doctor.getDireccion());
        personas.add(paciente);

        // Mostrar información del hospital
        System.out.println("Bienvenido al Sistema de Gestión Hospitalaria");
        System.out.println("--------------------------------------------");
        System.out.println("Hospital: " + hospital.getNombre());
        System.out.println("Dirección: " + hospital.getDireccion().getCalle() + ", " + hospital.getDireccion().getCiudad() + ", " + hospital.getDireccion().getCodigoPostal());
        System.out.println("Teléfono: " + hospital.getTelefono().getNumero());
        System.out.println("Farmacia: " + hospital.getFarmacia().getNombre());

        // Mostrar información del doctor
        System.out.println("\nDoctor Asignado:");
        System.out.println("Nombre: " + doctor.getNombre() + " " + doctor.getApellidos());
        String especialidad = "Medicina" ;
        System.out.println("Especialidad: " + doctor.getEspecialidad(especialidad));

        // Mostrar información del paciente
        System.out.println("\nPaciente Asignado:");
        System.out.println("Nombre: " + paciente.getNombre() + " " + paciente.getApellidos());
        System.out.println("Estado: " + paciente.getEstadoPaciente());

        // Mostrar historial médico del paciente
        System.out.println("\nHistorial Médico del Paciente:");
        System.out.println(paciente.mostrarHistorialMedico());

        // Simular una interacción con el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n¿Desea ver la lista de pacientes asignados al doctor? (s/n)");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            List<Paciente> pacientesAsignados = doctor.listarPacientesAsignados();
            System.out.println("\nPacientes Asignados:");
            for (Paciente p : pacientesAsignados) {
                System.out.println("- " + p.getNombre() + " " + p.getApellidos());
            }
        }

        scanner.close();
    }
}
