package versionUno;

public class Pescador extends SectorPrimario{

	private int caladero;

	public Pescador(Sexo sexo, String moteWeird, long numeroWeird, int diaNacimiento, byte lugarNacimiento,
			byte numeroHijos, EstadoCivil estado, byte formaDePago, boolean casar, int caladero) {
		super(sexo, moteWeird, numeroWeird, diaNacimiento, lugarNacimiento, numeroHijos, estado, formaDePago, casar);
		this.caladero = caladero;
	}

	public int getCaladero() {
		return caladero;
	}

	public void setCaladero(int caladero) {
		this.caladero = caladero;
	}
	
	

}
