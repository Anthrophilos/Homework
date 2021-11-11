package domaci_19_08;
import java.util.Scanner;

public class Domaci_19_08_3 {

	public static void main(String[] args) {
		/*Napisati program koji stampa sliku na ekranu za N redova. 
		 N unosi korisnik preko skenera. (Koristiti for petlju)
		Na primer N: 5
		 			*
		 			**
		 			***
		 			****
		 			******/
		System.out.println("Unesi broj: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String m = "*";
		
		for (int i = 0; i != N; i++) {
			System.out.println(m);
			m = m + "*";
		}sc.close();
	}      
		
}
