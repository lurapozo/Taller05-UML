package Usuarios;
import java.util.Date;

public class Persona {
	protected String usuario;
	protected String clave;
	protected String nombre;
	protected String apellido;
	protected String cedula;
	protected String direccion;
	protected Date fechaNac;
	
	public boolean logIn() {
		return true;
	}
	
	public boolean logOut() {
		return true;
	}
}
