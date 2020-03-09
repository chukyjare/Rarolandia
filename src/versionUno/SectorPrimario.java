package versionUno;

public class SectorPrimario extends Weirdiano{

	private byte numeroHijos;
	EstadoCivil estado;
	//Preguntar ma�ana si se trata de un n�mero solo, o un n�mero grande
	private byte formaDePago;
	
	
	public SectorPrimario(Sexo sexo, String moteWeird, long numeroWeird, int diaNacimiento, byte lugarNacimiento,
			byte numeroHijos, EstadoCivil estado, byte formaDePago, boolean casar) {
		super(sexo, moteWeird, numeroWeird, diaNacimiento, lugarNacimiento);
		this.numeroHijos = numeroHijos;
		this.estado = estado;
		this.formaDePago = formaDePago;
	}

	public byte getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(byte numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public EstadoCivil getEstado() {
		return estado;
	}

	public void setEstado(EstadoCivil estado) {
		this.estado = estado;
	}

	public byte getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(byte formaDePago) {
		this.formaDePago = formaDePago;
	}

	public EstadoCivil casar() {
		return this.estado=EstadoCivil.casado;
	}
	
	
	
}
