package versionUno;

public class Ganadero extends SectorPrimario{

	private int tipoAnimal, cantidad;
	private byte impuesto;
	
	public Ganadero(Sexo sexo, String moteWeird, long numeroWeird, int diaNacimiento, byte lugarNacimiento,
			byte numeroHijos, EstadoCivil estado, byte formaDePago, boolean casar, int tipoAnimal, int cantidad,
			byte impuesto) {
		super(sexo, moteWeird, numeroWeird, diaNacimiento, lugarNacimiento, numeroHijos, estado, formaDePago, casar);
		this.tipoAnimal = tipoAnimal;
		this.cantidad = cantidad;
		this.impuesto = impuesto;
	}

	public int getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(int tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public byte getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(byte impuesto) {
		this.impuesto = impuesto;
	}
	

}
