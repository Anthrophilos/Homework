package domaci_16_08;

import java.util.Scanner;

public class Domaci_16_08_03 {

	public static void main(String[] args) {
		Scanner domaci = new Scanner(System.in);

		/*
		 * Napisati program koji ce na standardnom izlazu ispisati poruku �Laku noc!�
		 * noliko puta koliko je korisnik zadao preko konzole. Primer: ako korisnik
		 * unese broj 20, poruku Laku noc! treba ispisati 20 puta
		 */

			System.out.print("Unesite broj ponavljanja: ");
		int x = domaci.nextInt();
		int i = 0;

		while (i < x) {
			i++;
			System.out.println("Laku noc!");

			domaci.close();

		}
	}
}
