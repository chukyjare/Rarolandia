package versionUno;

public class Agricultor extends SectorPrimario {

	private int numeroParcela;
	private byte especie, mes;
	
	public Agricultor(Sexo sexo, String moteWeird, long numeroWeird, int diaNacimiento, byte lugarNacimiento,
			byte numeroHijos, EstadoCivil estado, byte formaDePago, boolean casar, int numeroParcela, byte especie,
			byte mes) {
		super(sexo, moteWeird, numeroWeird, diaNacimiento, lugarNacimiento, numeroHijos, estado, formaDePago, casar);
		this.numeroParcela = numeroParcela;
		this.especie = especie;
		this.mes = mes;
	}

	public byte getEspecie() {
		return especie;
	}

	public void setEspecie(byte especie) {
		this.especie = especie;
	}

	public byte getMes() {
		return mes;
	}

	public void setMes(byte mes) {
		this.mes = mes;
	}

	public int getNumeroParcela() {
		return numeroParcela;
	}
	
	


	
}
