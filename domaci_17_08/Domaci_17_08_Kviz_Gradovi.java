package domaci_17_08;
import java.util.Scanner;

public class Domaci_17_08_Kviz_Gradovi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		/*
		 * Napisati program koji oponasa kviz za pogadjanje glavnog grada. - Program
		 * treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz z programa.
		 * 1. Francuska 2. Italija 3. Srbija 4. Izlaz - Nakon odabira drzave, potrebno
		 * je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?' - Ako korisnik
		 * odgovori tacno, ispisuje se poruka 'Odgovor je tacan' - Ako korisnik odgovori
		 * netacno, ispisuje se poruka 'Odgovor nije tacan' - Nakon davanja odgovora
		 * (bilo da je tacan ili netacan), ponovo treba da se postave sve pocetne opcije
		 * i ponudi korisniku da odabere neku od njih. - Program se zavrsava kad korisni
		 * odabere 4. opciju 'Izlaz' - Program uraditi koriscenjem dosad naucenog +
		 * do-while petlje
		 */

		boolean condition = true;
		String glavniGrad;

		do {
			System.out.println();
			System.out.println("Dobrodosli u kviz \"Pogodi prestonicu!\" ");
			System.out.println();
			System.out.println("Odaberite jednu od opcija: \n" + "	1.  Francuska \n" + "	2.  Italija \n"
					+ "	3.  Srbija \n" + "	4.  Izlaz ");

			int indexOpcije = sc.nextInt();

			switch (indexOpcije) {

			case 1:
				System.out.println("Koji je glavni grad Francuske? ");
				glavniGrad = sc.next();
				if (glavniGrad.equalsIgnoreCase("pariz")) {
					System.out.println("Odgovor je tacan! ");
				} else {
					System.out.println("Odgovor nije tacan! ");
				}
				break;
			case 2:
				System.out.println("Koji je glavni grad Italije? ");
				glavniGrad = sc.next();
				if (glavniGrad.equalsIgnoreCase("rim")) {
					System.out.println("Odgovor je tacan! ");
				} else {
					System.out.println("Odgovor nije tacan! ");
				}
				break;

			case 3:
				System.out.println("Koji je glavni grad Srbije? ");
				glavniGrad = sc.next();
				if (glavniGrad.equalsIgnoreCase("beograd")) {
					System.out.println("Odgovor je tacan! ");
				} else {
					System.out.println("Odgovor nije tacan! ");
				}
				break;

			case 4:

				System.out.println("Odabrali ste \"Izlaz\" ");
				condition = false;
				break;

			default:
				System.out.println("Niste izabrali odgovarajuvu opciju ");

			}

		} while (condition);
		sc.close();

		System.out.println("Kraj programa");
	}

}
