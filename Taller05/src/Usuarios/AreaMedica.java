package Usuarios;

import java.util.ArrayList;

public class AreaMedica {

	protected String especialidad;
	protected String costo;
	protected ArrayList<Doctor> doctores;
	
	public AreaMedica() {};
	
	public void agregarDoctor(Doctor d) {
		doctores.add(d);
	}
	
}
