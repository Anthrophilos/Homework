package domaci_06_09_2;


	/*
	 * Kreirati klasu Video Player koja ima: duzinu videa trenutno vreme videa
	 * jacinu zvuka kvalitet videa (144, 240, 360, 480, 720, 1080) getere, setere i
	 * konstruktore metodu stampaj koja stampa podatke u formatu: trenutno vreme
	 * videa jacinu zvuka kvalitet videa
	 */
public class VideoPlayer {
	private int duzinaVidea;
	private int trenutnoVremeVidea;
	private int jacinaZvuka;
	private int kvalitetVidea;

	public VideoPlayer(int duzinaVidea, int trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
		super();
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVremeVidea = trenutnoVremeVidea;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}

	public int getDuzinaVidea() {
		return duzinaVidea;
	}

	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}

	public int getTrenutnoVremeVidea() {
		return trenutnoVremeVidea;
	}

	public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
		this.trenutnoVremeVidea = trenutnoVremeVidea;
	}

	public int getJacinaZvuka() {
		return jacinaZvuka;
	}

	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}

	public int getKvalitetVidea() {
		return kvalitetVidea;
	}

	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}

	public void stampa() {
		// duzina kvalitet
		System.out.println("Trenutno vreme videa " + this.trenutnoVremeVidea + " minuta.");
		System.out.println("Nivo zvuka: " + this.jacinaZvuka + "%");
		System.out.println("Duzina videa: " + this.duzinaVidea + " minuta.");
		System.out.println("Kvalitet videa: " + this.kvalitetVidea + "p");

	}

}
