package versionUno;

public class Comerciante extends SectorSecundario {

	private byte prodcuto;

	public Comerciante(Sexo sexo, String moteWeird, long numeroWeird, int diaNacimiento, byte lugarNacimiento,
			int numeroLicencia, int fechaInicio, String nombreExplotacion, byte prodcuto) {
		super(sexo, moteWeird, numeroWeird, diaNacimiento, lugarNacimiento, numeroLicencia, fechaInicio,
				nombreExplotacion);
		this.prodcuto = prodcuto;
	}

	public byte getProdcuto() {
		return prodcuto;
	}

	public void setProdcuto(byte prodcuto) {
		this.prodcuto = prodcuto;
	}

	
}
