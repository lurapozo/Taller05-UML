package tramites;

import java.util.Date;

public class PagoTarjeta implements Pago{
	protected float monto;
	protected String numero;
	protected String propietario;
	protected String banco;
	protected Date expira;
	
	@Override
	public boolean realizarPago(float monto) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
