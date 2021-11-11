package domaci_08_09;
/*Covek poseduje ime i prezime koji se dodeljuju prilikom 
 kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i postave.*/
public class Covek {

	private String imePrezime;

	public Covek(String imePrezime) {
		super();
		this.imePrezime = imePrezime;
	}

	public String getImePrezime() {
		return imePrezime;
	}
	
	public void stampanje() {
		System.out.println("Covek: " + imePrezime + ".");
	}
	
	
	
	
	
	
}
