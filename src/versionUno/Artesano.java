package versionUno;

public class Artesano extends SectorSecundario {

	private String direccion;
	EspecialidadArtesano especialidad;
	
	public Artesano(Sexo sexo, String moteWeird, long numeroWeird, int diaNacimiento, byte lugarNacimiento,
			int numeroLicencia, int fechaInicio, String nombreExplotacion, String direccion,
			EspecialidadArtesano especialidad) {
		super(sexo, moteWeird, numeroWeird, diaNacimiento, lugarNacimiento, numeroLicencia, fechaInicio,
				nombreExplotacion);
		this.direccion = direccion;
		this.especialidad = especialidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public EspecialidadArtesano getEspecialidad() {
		return especialidad;
	}
	
}
