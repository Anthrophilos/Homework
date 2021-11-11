package domaci_19_08;
import java.util.Scanner;

public class Domaci_19_08_1 {

	public static void main(String[] args) {
		/*-Napisati program gde korisnik unosi pozitivne brojeve, kad unese negativan broj 
		 * prikaze mu se suma svih prethodno unetih brojeva i na kraju zakomentarisati koje 
		 * ste brojeve sve unosili po testu
na primer:
//test 1 x, y, z
//test 2 x, y, z
//test 3 x, y, z
(Koristiti do while petlju)*/
	//Uneti brojevi su: 4,5,6,7,8,5,4,3,3,2,-10, vracen rezultat 47
		Scanner sc = new Scanner(System.in);
		int broj = 0;
		int zbir = 0;
		
		do {
			zbir = zbir + broj;
			System.out.println("Unesite broj: ");
			broj = sc.nextInt();
		}
		while (broj >= 0);
		System.out.println("Rezultat je: " + zbir);
		sc.close();
	}

}

