package domaci_23_08;
import java.util.Scanner;

public class Domaci_23_08 {

	public static void main(String[] args) {
		
		
		/*Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		 * (znaci da korisnik unosi tri broja) i taj program treba da pozove i ispise 
		 * (u mainu) najmanji od ta tri unesena broja.*/
	
			Scanner sc = new Scanner(System.in);

			int[] broj = new int[3];
			for (int i = 0; i < broj.length; i++) {
				
				System.out.println("Unesite neki broj:");
				broj[i] = sc.nextInt();
			}
			sc.close();

			int minimalniBroj = minimum(broj);
			System.out.println("\nNajmanji uneti broj je: " + minimalniBroj);

		}

		private static int minimum(int[] broj) {
			int minimalniBroj = broj[0];
			for (int i = 0; i < broj.length; i++) {
				if (minimalniBroj > broj[i]) {
					minimalniBroj = broj[i];
				}
			}
			return minimalniBroj;
		}
		
					
		
	}


