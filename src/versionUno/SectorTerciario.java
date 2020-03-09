package versionUno;

public class SectorTerciario extends Weirdiano{

	private int fechaInicio;
	private byte duracionContrato, sueldo;
	
	public SectorTerciario(Sexo sexo, String moteWeird, long numeroWeird, int diaNacimiento, byte lugarNacimiento,
			int fechaInicio, byte duracionContrato, byte sueldo) {
		super(sexo, moteWeird, numeroWeird, diaNacimiento, lugarNacimiento);
		this.fechaInicio = fechaInicio;
		this.duracionContrato = duracionContrato;
		this.sueldo = sueldo;
	}

	public int getFechaInicio() {
		return fechaInicio;
	}

	public byte getDuracionContrato() {
		return duracionContrato;
	}

	public byte getSueldo() {
		return sueldo;
	}
	
	 

}
