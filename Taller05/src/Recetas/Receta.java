package Recetas;

import java.time.LocalDateTime;
import java.util.ArrayList;

import Usuarios.Doctor;
import Usuarios.Paciente;

public class Receta {
	
	protected LocalDateTime fecha;
	protected Paciente paciente;
	protected ArrayList<Medicamento> medicamentos;
	protected PlanNutricional planNut;
	protected Doctor doctor;
	
	public Receta() {
		medicamentos = new ArrayList<>();
		planNut = new PlanNutricional();
	}
	
}
