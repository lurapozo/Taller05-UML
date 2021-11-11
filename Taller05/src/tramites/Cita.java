package tramites;

import java.time.LocalDateTime;

import Usuarios.Doctor;

public class Cita implements Pago {
	
	protected LocalDateTime fecha;
	protected boolean pagada;
	protected String registradoPor;
	protected Doctor doctor;
	
	public Cita() {
		this.pagada=false;
	}

	@Override
	public boolean realizarPago(float monto) {
		this.pagada=true;
		return true;
	}
	
	public void atendidaPor(Doctor d) {
		this.doctor=d;
	}
	
}
