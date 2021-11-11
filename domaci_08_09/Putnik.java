package domaci_08_09;

/*Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja 
 mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu se doda i/ili oduzme.*/
public class Putnik extends Covek {

	private double novac;
	

	public Putnik(String imePrezime, double novac) {
		super(imePrezime);
		this.novac = novac;

	}

	public void dodavanjeNovca(double novac) {
		this.novac += novac;
		
	}public void oduzimanjeNovca(double novac) {
	this.novac-=novac;
	}
		
	
	public double getNovac() {
		return novac;
	}

	public void stampanje() {

		System.out.println("Ime putnika: " + getImePrezime() + " poseduje " + novac 
				+ " dinara.");
	}
}
