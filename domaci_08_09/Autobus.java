package domaci_08_09;

import java.util.ArrayList;

//import arh.biro.Arhitekta;

/*Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. Naziv i cena
 karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca.*/
public class Autobus {

	private String nazivAutobusa;
	private String vozac;
	private double cenaKarte;
	private String putnik;
	private ArrayList<Putnik> listaPutnika;
	private ArrayList<Vozac> listaVozaca;

	public Autobus(String nazivAutobusa, String vozac, double cenaKarte, String putnik) {

		this.nazivAutobusa = nazivAutobusa;
		this.vozac = vozac;
		this.cenaKarte = cenaKarte;
		this.putnik = putnik;
		this.listaPutnika = new ArrayList<Putnik>();
		this.listaVozaca = new ArrayList<Vozac>();

	}

	public Vozac dodavanjeVozaca(String imePrezime, String zvanje) {
		Vozac noviVozac = new Vozac(imePrezime, zvanje);
		listaVozaca.add(noviVozac);
		return noviVozac;

	}

	public Vozac oduzimanjeVozaca(String imePrezime, String zvanje) {
		Vozac minusVozac = new Vozac(imePrezime, zvanje);
		listaVozaca.remove(minusVozac);
		return minusVozac;
	}

	public Putnik dodavanjePutnika(String imePrezime) {

		Putnik noviPutnik = new Putnik(imePrezime, 395);
		listaPutnika.add(noviPutnik);
		return noviPutnik;
	}

	public Putnik oduzimanjePutnika(String imePrezime) {
		Putnik minusPutnik = new Putnik(imePrezime, 122);
		listaPutnika.remove(minusPutnik);
		return minusPutnik;

	}

	public void stampanje() {
		System.out.println("Autobus na liniji - " + nazivAutobusa + ", vozac " + vozac + ", cena karte " + cenaKarte
				+ " rsd, putnik " + putnik + ".");
	}

}
