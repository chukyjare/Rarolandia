package versionUno;

public class SectorSecundario extends Weirdiano{
	
	private int numeroLicencia, fechaInicio;
	private char[] nombre= new char[30];
	private String nombreExplotacion = new String(nombre);
	
	public SectorSecundario(Sexo sexo, String moteWeird, long numeroWeird, int diaNacimiento, byte lugarNacimiento,
			int numeroLicencia, int fechaInicio, String nombreExplotacion) {
		super(sexo, moteWeird, numeroWeird, diaNacimiento, lugarNacimiento);
		this.numeroLicencia = numeroLicencia;
		this.fechaInicio = fechaInicio;
		this.nombreExplotacion = nombreExplotacion;
	}

	public int getNumeroLicencia() {
		return numeroLicencia;
	}

	public int getFechaInicio() {
		return fechaInicio;
	}

	public String getNombreExplotacion() {
		return nombreExplotacion;
	}
	
	
}
