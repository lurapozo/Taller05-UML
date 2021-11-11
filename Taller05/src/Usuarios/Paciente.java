package Usuarios;
import java.util.ArrayList;
import Recetas.Receta;
import tramites.Cita;
import tramites.HistoriaClinica;

public class Paciente extends Persona{
	protected String email;
	protected ArrayList<Receta> receta;
	protected HistoriaClinica historiaclinica;
	protected Cita cita;
	public boolean solicitarCita() {
		return true;
	}

}