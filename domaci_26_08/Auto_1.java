package domaci_26_08;

public class Auto_1 {

	public static void main(String[] args) {

		Automobil auto1 = new Automobil();
		auto1.marka = "Aston Martin";
		auto1.model = "Vanquish";
		auto1.pogon = "benzin";
		auto1.brojVrata = 2;
		auto1.godiste = 2017;
		auto1.setPredjeniKm(8799);

		auto1.stampanje();

		// klasa za prazan konstruktor
	}

}
