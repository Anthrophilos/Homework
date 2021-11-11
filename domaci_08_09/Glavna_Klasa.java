package domaci_08_09;

public class Glavna_Klasa {

	public static void main(String[] args) {
		Covek covek = new Covek("Nikola Bozovic");
				covek.stampanje();

				
				Vozac vozac = new Vozac("Micko Pampersic", "sofer");
				vozac.stampanje();
				Vozac NoviVozac= new Vozac("Nikola Arsenijevic" , "vozac");
				NoviVozac.stampanje();
				Putnik putnik = new Putnik("Avram Markovic", 3562);
				putnik.stampanje();
				
				
				Autobus autobus = new Autobus("215", "Vesna Morena", 91, "Perun Grmljavnik");
				autobus.stampanje();
				
	}
	
	
	

}
