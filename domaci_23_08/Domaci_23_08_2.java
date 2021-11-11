package domaci_23_08;
import java.util.Scanner;

public class Domaci_23_08_2 {

	public static void main(String[] args) {
		/*Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		 i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.*/ 

		
			Scanner sc = new Scanner(System.in);

			int[] broj = new int[3];
			for (int i = 0; i < broj.length; i++) {
				System.out.println("Unesite neki broj:");
				broj[i] = sc.nextInt();
			}
			sc.close();

			int proizvod = calculation(broj);
			System.out.println("Ukupna vrednost unetih brojeva je: " + proizvod);
		}

		private static int calculation(int[] broj) {
			int proizvod = broj[0];
			for (int i = 1; i < broj.length; i++) {
				proizvod *= broj[i];
			}
			return proizvod;

		}
		
		
	}


