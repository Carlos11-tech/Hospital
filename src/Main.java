import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la dirección del hospital
        Direccion direccionHospital = new Direccion("Eloy alfaro", "18 de noviembre", "LOJA");

        // Crear una instancia del teléfono del hospital
        Telefono telefonoHospital = new Telefono("0969966088", "claro");

        // Crear una lista de personas en el hospital
        List<Persona> personas = new ArrayList<>();

        // Crear una instancia de la farmacia del hospital
        Direccion direccionFarmacia = new Direccion("Avenida Secundaria", "Ciudad", "67890");
        Telefono telefonoFarmacia = new Telefono("098-765-4321", "Farmacia");
        Farmacia farmacia = new Farmacia("Farmacia Central", direccionFarmacia, telefonoFarmacia);

        // Crear una instancia del hospital
        Hospital hospital = new Hospital("Hospital General", direccionHospital, telefonoHospital, personas, farmacia);

        // Crear una instancia de un doctor
        Direccion direccionDoctor = new Direccion("Calle Terciaria", "Ciudad", "54321");
        Telefono telefonoDoctor = new Telefono("234-567-8901", "Doctor");
        Doctor doctor = new Doctor("Juan", "Pérez", new Date(), Genero.MASCULINO, direccionDoctor, telefonoDoctor, "D001", Especialidad.MEDICINA);

        // Crear una instancia de un paciente
        Direccion direccionPaciente = new Direccion("Calle Cuarta", "Ciudad", "67890");
        Telefono telefonoPaciente = new Telefono("345-678-9012", "Paciente");
        HistoriaMedica historiaMedica = new HistoriaMedica() {
            private List<String> historial = new ArrayList<>();

            @Override
            public void agregarDiagnostico(String diagnostico) {
                historial.add("Diagnóstico: " + diagnostico);
            }

            @Override
            public void agregarTratamiento(String tratamiento) {
                historial.add("Tratamiento: " + tratamiento);
            }

            @Override
            public void agregarMedicamento(String medicamento) {
                historial.add("Medicamento: " + medicamento);
            }

            @Override
            public void agregarReceta(String receta) {
                historial.add("Receta: " + receta);
            }

            @Override
            public void agregarFecha(String fecha) {
                historial.add("Fecha: " + fecha);
            }

            @Override
            public void agregarHora(String hora) {
                historial.add("Hora: " + hora);
            }

            @Override
            public void agregarEspecialidad(Especialidad especialidad) {
                historial.add("Especialidad: " + especialidad);
            }

            @Override
            public void agregarEstadoPaciente(EstadoPaciente estadoPaciente) {
                historial.add("Estado Paciente: " + estadoPaciente);
            }

            @Override
            public void agregarGenero(Genero genero) {
                historial.add("Género: " + genero);
            }

            @Override
            public void agregarFarmacia(Farmacia farmacia) {
                historial.add("Farmacia: " + farmacia.getNombre());
            }

            @Override
            public void agregarMedico(String medico) {
                historial.add("Médico: " + medico);
            }

            @Override
            public void agregarPaciente(String paciente) {
                historial.add("Paciente: " + paciente);
            }

            @Override
            public void agregarEdad(int edad) {
                historial.add("Edad: " + edad);
            }

            @Override
            public void agregarPeso(double peso) {
                historial.add("Peso: " + peso);
            }

            @Override
            public void agregarAltura(double altura) {
                historial.add("Altura: " + altura);
            }

            @Override
            public void agregarPresionArterial(double presionArterial) {
                historial.add("Presión Arterial: " + presionArterial);
            }

            @Override
            public void agregarTemperatura(double temperatura) {
                historial.add("Temperatura: " + temperatura);
            }

            @Override
            public void agregarFrecuenciaCardiaca(double frecuenciaCardiaca) {
                historial.add("Frecuencia Cardiaca: " + frecuenciaCardiaca);
            }

            @Override
            public void agregarFrecuenciaRespiratoria(double frecuenciaRespiratoria) {
                historial.add("Frecuencia Respiratoria: " + frecuenciaRespiratoria);
            }

            @Override
            public void agregarSaturacionOxigeno(double saturacionOxigeno) {
                historial.add("Saturación de Oxígeno: " + saturacionOxigeno);
            }

            @Override
            public void agregarAlergias(String alergias) {
                historial.add("Alergias: " + alergias);
            }

            @Override
            public void agregarAntecedentes(String antecedentes) {
                historial.add("Antecedentes: " + antecedentes);
            }

            @Override
            public void agregarObservaciones(String observaciones) {
                historial.add("Observaciones: " + observaciones);
            }

            @Override
            public void agregarSintomas(String sintomas) {
                historial.add("Síntomas: " + sintomas);
            }

            @Override
            public void agregarMotivoConsulta(String motivoConsulta) {
                historial.add("Motivo de Consulta: " + motivoConsulta);
            }

            @Override
            public void agregarHistoriaFamiliar(String historiaFamiliar) {
                historial.add("Historia Familiar: " + historiaFamiliar);
            }

            @Override
            public void agregarHistoriaPersonal(String historiaPersonal) {
                historial.add("Historia Personal: " + historiaPersonal);
            }

            @Override
            public void agregarHistoriaMedica(String historiaMedica) {
                historial.add("Historia Médica: " + historiaMedica);
            }

            @Override
            public void agregarHistoriaQuirurgica(String historiaQuirurgica) {
                historial.add("Historia Quirúrgica: " + historiaQuirurgica);
            }

            @Override
            public void agregarHistoriaObstetrica(String historiaObstetrica) {
                historial.add("Historia Obstétrica: " + historiaObstetrica);
            }

            @Override
            public void agregarHistoriaToxicologica(String historiaToxicologica) {
                historial.add("Historia Toxicológica: " + historiaToxicologica);
            }

            @Override
            public void agregarHistoriaPsicologica(String historiaPsicologica) {
                historial.add("Historia Psicológica: " + historiaPsicologica);
            }

            @Override
            public void agregarHistoriaSocial(String historiaSocial) {
                historial.add("Historia Social: " + historiaSocial);
            }

            @Override
            public void agregarHistoriaLaboral(String historiaLaboral) {
                historial.add("Historia Laboral: " + historiaLaboral);
            }

            @Override
            public void agregarHistoriaMedicamentos(String historiaMedicamentos) {
                historial.add("Historia de Medicamentos: " + historiaMedicamentos);
            }

            @Override
            public void agregarHistoriaAlergias(String historiaAlergias) {
                historial.add("Historia de Alergias: " + historiaAlergias);
            }

            @Override
            public void agregarHistoriaInmunizaciones(String historiaInmunizaciones) {
                historial.add("Historia de Inmunizaciones: " + historiaInmunizaciones);
            }

            @Override
            public void agregarHistoriaExamenFisico(String historiaExamenFisico) {
                historial.add("Historia de Examen Físico: " + historiaExamenFisico);
            }

            @Override
            public void agregarHistoriaEstudios(String historiaEstudios) {
                historial.add("Historia de Estudios: " + historiaEstudios);
            }

            @Override
            public void agregarHistoriaTratamientos(String historiaTratamientos) {
                historial.add("Historia de Tratamientos: " + historiaTratamientos);
            }

            @Override
            public String mostrarHistorialMedico() {
                return String.join("\n", historial);
            }
        };
        Paciente paciente = new Paciente();

        // Asignar paciente al doctor
        doctor.asignarPaciente(paciente);

        // Agregar el doctor y paciente a la lista de personas en el hospital
        personas.add(doctor.getDireccion());
        personas.add(paciente.getTelefono());

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

