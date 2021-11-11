package domaci_06_09_2;

/*U glavnom programu kreirati video player i izvrsiti neke akcije nad njim
U glavnom programu kreirati listu akcija i izvrsiti ih nad istim playerom*/
import java.util.ArrayList;

public class GlavnaKlasa {

	public static void main(String[] args) {

		VideoPlayer vp1 = new VideoPlayer(88, 60, 21, 860);
		vp1.stampa();
		System.out.println("______________________");
		System.out.println("Korekcija duzine videa");
		System.out.println("______________________");
		TimeControl t1 = new TimeControl(true);
		t1.izvrsiAkciju(vp1);
		vp1.stampa();

		System.out.println("_______________________");
		System.out.println("Regulisanje nivoa zvuka");
		System.out.println("_______________________");

		AudioControl a1 = new AudioControl(true);
		a1.izvrsiAkciju(vp1);
		vp1.stampa();

		System.out.println("__________________________________________");
		System.out.println("Optimizacija kvaliteta videa prema protoku");
		System.out.println("__________________________________________");

		QualityOptimizerControl o1 = new QualityOptimizerControl(60);
		o1.izvrsiAkciju(vp1);
		vp1.stampa();

		System.out.println("_____");
		System.out.println("Radnja");
		System.out.println("_____");

		ArrayList<Control> radnja = new ArrayList<Control>();
		radnja.add(t1);
		radnja.add(a1);
		radnja.add(o1);

		for (int i = 0; i < radnja.size(); i++) {
			radnja.get(i).izvrsiAkciju(vp1);

		}

		vp1.stampa();

	}

}
