package domaci_06_09;

public class Ribe {
//Ribe su kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda), broj peraja, vrsta peraja
	private String ime; // brotfis
	private String slatkovodna; // je riba
	private String morska;// nije
	protected String brojPeraja;// 5
	protected String vrstaPeraja; // grudno, replo, ledjno

	public Ribe(String ime, String slatkovodna, String morska, String brojPeraja, String VrstaPeraja) {

		this.ime = ime;
		this.slatkovodna = slatkovodna;
		this.morska = morska;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = VrstaPeraja;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getSlatkovodna() {
		return slatkovodna;
	}

	public void setSlatkovodna(String slatkovodna) {
		this.slatkovodna = slatkovodna;
	}

	public String getMorska() {
		return morska;
	}

	public void setMorska(String morska) {
		this.morska = morska;
	}

	public String getBrojPeraja() {
		return brojPeraja;
	}

	public void setBrojPeraja(String brojPeraja) {
		this.brojPeraja = brojPeraja;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}

	public void stampanje() {

		System.out.println(ime + " je interesantna " + slatkovodna + " riba," + " ima " + brojPeraja + " peraja - "
				+ vrstaPeraja + ".");
		System.out.println();

	}
}
