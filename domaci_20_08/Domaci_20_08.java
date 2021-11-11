package domaci_20_08;

public class Domaci_20_08 {

	public static void main(String[] args) {
		
				/*
				 * Napisati program gde u nizu napisete ovih 5 gradova (Lisabon, London,
				 * Helsinki, Prag i Madrid) a program stampa gradove sve dok ne dodje do
				 * "Prag"-a Napisati program gde u nizu napisete 5 gradova, a program vam
				 * odstampa sve osim prvog i poslednjeg unosa
				 */
				
				String[] gradovi = { "Lisabon", "London", "Helsiniki", "Prag", "Madrid" };
				for (int i = 0; i < 3; i++) {
					System.out.println("Gradovi: " + gradovi[i]);
				}
				System.out.println("__________________");
				for (int i = 1; i < 4; i++) {
					System.out.println("Gradovi: " + gradovi[i]);
				}
			}
		} 
		
	