package tramites;

import java.time.LocalDateTime;

import Usuarios.Doctor;
import Usuarios.Paciente;

public class Cita implements Pago {
	
	protected LocalDateTime fecha;
	protected boolean pagada;
	protected String registradoPor;
	protected Doctor doctor;
	protected Paciente paciente;
	
	public Cita() {
		this.pagada=false;
	}

	@Override
	public boolean realizarPago(float monto) {
		this.pagada=true;
		return true;
	}
	
}
