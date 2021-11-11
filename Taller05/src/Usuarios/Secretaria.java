package Usuarios;

public class Secretaria extends Persona{
	
	protected Doctor doctor;
	
	public Secretaria() {}
	
	public void verificarCita() {
		
	}
	
	public void agendarCita() {
		
	}
	
	public void ayudaDoctor(Doctor d) {
		this.doctor=d;
		d.registraSecretaria(this);
	}
	
	
}
