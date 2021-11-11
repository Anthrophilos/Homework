package domaci_12_08;

import java.util.Scanner;
/*				 
Napisati program gde deklarisete vase ime, prezime kao string,
pol kao char i odstampajte adekvatno sva tri unosa. Nakon 
toga preko skenera treba da unesete ukupan broj medalja koliko
je Srbija osvojila na olimpijskim igrama i ukupan broj zlatnih
medalja koliko je Srbija osvojila na olimpijskim igrama, na 
kraju treba odstampati procenat zlatnih medalja u odnosu na 
ukupan broj medalja. Ako ima pitanja pisite u thread.

*/

public class Domaci_12_08 {

	public static void main(String[] args) {
		Scanner oi = new Scanner(System.in);

		String ime = "Milan";
		System.out.println("Ime: " + ime);

		String prezime = "Panic";
		System.out.println("Prezime: " + prezime);

		char pol = 'm';
		System.out.println("Pol: " + pol);

		System.out.print("Unesi ukupan broj osvojenih medalja za Srbiju na OI: ");
		double medalje = oi.nextDouble();

		System.out.print("Unesi ukupan broj osvojenih zlatnih medalja za Srbiju na OI: ");
		double zmedalje = oi.nextDouble();

		double procenatZlatnihMedalja = zmedalje / medalje * 100;
		System.out
				.print("Procenat zlatnih medalja u odnosu na ukupan broj medalja je: " + procenatZlatnihMedalja + "%");
		oi.close();

	}

}
