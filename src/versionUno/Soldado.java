package versionUno;

public class Soldado extends SectorTerciario{
	private String especialidad;
	private byte graduacion;
	
	public Soldado(Sexo sexo, String moteWeird, long numeroWeird, int diaNacimiento, byte lugarNacimiento,
			int fechaInicio, byte duracionContrato, byte sueldo, String especialidad, byte graduacion) {
		super(sexo, moteWeird, numeroWeird, diaNacimiento, lugarNacimiento, fechaInicio, duracionContrato, sueldo);
		this.especialidad = especialidad;
		this.graduacion = graduacion;
	}

	public byte getGraduacion() {
		return graduacion;
	}

	public void setGraduacion(byte graduacion) {
		this.graduacion = graduacion;
	}

	public String getEspecialidad() {
		return especialidad;
	}
	
	
	
}
