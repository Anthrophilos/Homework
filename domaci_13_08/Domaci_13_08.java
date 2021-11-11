package domaci_13_08;
import java.util.Scanner;

public class Domaci_13_08 {

	public static void main(String[] args) {

		Scanner domaci = new Scanner(System.in);

		System.out.print("Unesite broj: ");
		int broj = domaci.nextInt();

		if (broj < 10) {

			int brojDeset = broj * 100;
			System.out.println("Broj je manji od 10, mnozim sa 100. " + "Vas broj je: " + brojDeset);
		} else if (broj > 100) {

			double brojSto = broj / 10;
			System.out.println("Broj je veci od 100, delim sa 10." + "Vas broj je: " + brojSto);
		} else {
			System.out.println("Broj nije manji od 10 i nije veci od 100.");
		}

		domaci.close();

	}

}
