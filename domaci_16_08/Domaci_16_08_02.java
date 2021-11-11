package domaci_16_08;
import java.util.Scanner;

public class Domaci_16_08_02 {

	public static void main(String[] args) {
		/*Napisati program koji unosi i sabira 
		  brojeve dokle god nije unesen negativan broj,
		i ispisuje njihov zbir (zbir pozitivnih brojeva).
		primer: ako korisnik unese 1 2 5 3 -1,  
		program treba da ispise 11*/
		
		
		Scanner domaci = new Scanner(System.in);
		int x = 1;
		int zbir = 0;
		
		while (x > 0) {
			System.out.println("Unesite broj: ");
			x = domaci.nextInt();
			
			if (x < 0) {
			break;	
			}
			zbir = zbir + x;
						
		}
		System.out.println("Zbir brojeva je: " + zbir);
		
		
		domaci.close();
	}

}
