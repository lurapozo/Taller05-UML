package Usuarios;
import java.util.ArrayList;

import Recetas.Receta;
import tramites.Cita;
import tramites.HistoriaClinica;

public class Paciente extends Persona{
	
	protected String email;
	protected ArrayList<Receta> recetas;
	protected HistoriaClinica historiaClinica;
	protected Cita cita;
	
	public Paciente() {
		historiaClinica = new HistoriaClinica();
		recetas = new ArrayList<>();
	}
	
	public boolean solicitarCita() {
		return true;
	}
	
}
