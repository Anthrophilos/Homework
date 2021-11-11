package domaci_23_08;
import java.util.Scanner;

public class Domaci_23_08_3 {

	public static void main(String[] args) {
		/* spojena prva dva zadatka sa malo izmenjenim zahtevima -> Napisati program koji 
		 * ce procitati 3 cela broja sa standardnog ulaza i poziva i 
		 * ispisuje dve metode. Prva ispisuje zbir tri unesena broja,
		 *  a druga vraca najveci od unetih brojeva.*/ 
		
		Scanner sc= new Scanner(System.in);
			
		int[] broj = new int[3];
		for (int i = 0; i < broj.length; i++) {
			System.out.println("Unesite neki broj:");
			broj[i] = sc.nextInt();
		}
		sc.close();

		int zbir = sabiranje(broj);
		int maksimalniBroj = maksimalniBroj(broj);
		System.out.println("Zbir unetih brojeva je: " + zbir + "\nNajveci uneti broj je: " + maksimalniBroj);

	}

	private static int sabiranje(int[] broj) {
		int zbir = broj[0];
		for (int i = 1; i < broj.length; i++) {
			zbir = zbir + broj[i];
		}
		return zbir;
	}

	private static int maksimalniBroj(int[] broj) {
		int maksimalniBroj = broj[0];
		for (int i = 0; i < broj.length; i++) {
			if (maksimalniBroj < broj[i]) {
				maksimalniBroj = broj[i];
			}
		}
		return maksimalniBroj;
		
		
		
	}

}
