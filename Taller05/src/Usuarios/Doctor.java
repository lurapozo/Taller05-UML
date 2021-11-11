package Usuarios;
import java.util.ArrayList;
import tramites.Cita;


public class Doctor extends Persona{
	
	protected int regDoctor;
	protected String especialidad;
	protected Secretaria secretaria;
	protected AreaMedica area;
	protected ArrayList<Cita> citasPendientes;
	
	public Doctor() {}
	
	public void recetar() {
		
	}
	
	public void agregarPlanNut() {
		
	}
	
	public void imprimirReceta() {
		
	}
	
	public void registraSecretaria(Secretaria s) {
		this.secretaria=s;
	}
	
	public void setAreaMedica(AreaMedica am) {
		this.area=am;
		am.agregarDoctor(this);
	}
}
