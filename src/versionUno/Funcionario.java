package versionUno;

public class Funcionario extends SectorTerciario {

	private String departamento;

	public Funcionario(Sexo sexo, String moteWeird, long numeroWeird, int diaNacimiento, byte lugarNacimiento,
			int fechaInicio, byte duracionContrato, byte sueldo, String departamento) {
		super(sexo, moteWeird, numeroWeird, diaNacimiento, lugarNacimiento, fechaInicio, duracionContrato, sueldo);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}
	
	

}
