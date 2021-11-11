package tramites;

import java.time.LocalDateTime;
import Usuarios.Paciente;

public class Cita {
	protected LocalDateTime fecha;
	protected boolean pagada;
	protected String registradoPor;
	protected Paciente paciente;
	
	public void realizarPago(Pago pago) {
		
	}
}
