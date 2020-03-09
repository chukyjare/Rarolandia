package versionUno;

public class Weirdiano {

	Sexo sexo;
	private String moteWeird;
	private long numeroWeird;
	private int diaNacimiento;
	private byte lugarNacimiento;
	
	public Weirdiano(Sexo sexo, String moteWeird, long numeroWeird, int diaNacimiento, byte lugarNacimiento) {
		super();
		this.sexo = sexo;
		this.moteWeird = moteWeird;
		this.numeroWeird = numeroWeird;
		this.diaNacimiento = diaNacimiento;
		this.lugarNacimiento = lugarNacimiento;
	}

	public String getMoteWeird() {
		return moteWeird;
	}

	public void setMoteWeird(String moteWeird) {
		this.moteWeird = moteWeird;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public long getNumeroWeird() {
		return numeroWeird;
	}

	public int getDiaNacimiento() {
		return diaNacimiento;
	}

	public byte getLugarNacimiento() {
		return lugarNacimiento;
	}

}
