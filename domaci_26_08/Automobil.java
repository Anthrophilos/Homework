package domaci_26_08;

public class Automobil {

	public String marka;
	public String model;
	public String pogon;
	public int brojVrata;
	public int godiste;
	private int predjeniKm;
	public int potrosnja;
	private int kubikaza;

	public Automobil(String marka, String model, String pogon, int brojVrata, int godiste, int kubikaza) {

		this.marka = marka;
		this.model = model;
		this.pogon = pogon;
		this.brojVrata = brojVrata;
		this.godiste = godiste;
		this.kubikaza = kubikaza;

	}

	public Automobil() {

	}

	public void stampanje() {
		System.out.println("Auto " + marka + " " + model + " je " + godiste + ". godiste, ima " + brojVrata + " vrata,"
				+ "\n" + "ide na " + pogon + ", a presao je " + getPredjeniKm() + " kilometara.\nPotrosnja je "
				+ potrosnjaKm() + "l na 100km." + "\n" + "Za " + "gorivo je ukupno potroseno: " + ukupnoZaGorivo()
				+ " dinara.");
	}

	public void setPredjeniKm(int km) {
		this.predjeniKm = km;
	}

	public int getPredjeniKm() {
		return this.predjeniKm;
	}

	public int potrosnjaKm() {
		if (this.kubikaza > 1000) {
			return this.potrosnja = 10;

		} else {
			return this.potrosnja = 8;
		}

	}

	public int ukupnoZaGorivo() {
		int ukupnoZaGorivo = this.predjeniKm * this.potrosnja * 120 / 100;
		return ukupnoZaGorivo;

	}

}
