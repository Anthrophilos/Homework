package domaci_06_09;


/*Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. 
Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi*/
class Staniste {
	
	private String staniste;
	private String pingvini;
	private String morz;
	private String narval;
	private String beluga;
	private String njorka;

	public Staniste(String staniste, String pingvini, String morz, String narval, String beluga, String njorka) {

		this.staniste = staniste;
		this.pingvini = pingvini;
		this.morz = morz;
		this.narval = narval;
		this.beluga = beluga;
		this.njorka = njorka;

	}

	public String getStaniste() {
		return staniste;
	}

	public void setStaniste(String staniste) {
		this.staniste = staniste;
	}

	public String getPingvini() {
		return pingvini;
	}

	public void setPingvini(String pingvini) {
		this.pingvini = pingvini;
	}

	public String getMorz() {
		return morz;
	}

	public void setMorz(String morz) {
		this.morz = morz;
	}

	public String getNarval() {
		return narval;
	}

	public void setNarval(String narval) {
		this.narval = narval;
	}

	public String getBeluga() {
		return beluga;
	}

	public void setBeluga(String beluga) {
		this.beluga = beluga;
	}

	public String getNjorka() {
		return njorka;
	}

	public void setNjorka(String njorka) {
		this.njorka = njorka;
	}

	public void stampanje() {
		System.out.println("Ovo staniste se zove " + this.staniste + ", na ledu (kopnu) zive" + this.pingvini + "i\n"
				+ this.morz + ", a u vodi su " + this.narval + "i " + this.beluga + ","+ " dok vazduhom krstare nemilosrdne "
				+ this.njorka + ".");
		System.out.println();

	}

}
