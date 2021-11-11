package domaci_06_09_2;

/*Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i ima brzinu interneta
 u megabitima npr 10mb/s 20mb/s... Getere, setere i konstruktore. 
 Implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta.
 Kvalitet se racuna na osnovu formule: brzina interneta * 10.1 gde se uzima prvi veci kvalitet
 ako je brzina 20 * 10.1 = 204 - postavlja 240;
 ako je brzina 5*10.1 = 50.5 - postavlja 144;
 ako je brzina 20*10.1 = 505 - postavlja 720;*/
public class QualityOptimizerControl extends Control {
	private double brzinaInt;

	public QualityOptimizerControl(double brzinaInt) {

		this.brzinaInt = brzinaInt;
	}

	public double getBrzinaInt() {
		return brzinaInt;
	}

	public void setBrzinaInt(double brzinaInt) {
		this.brzinaInt = brzinaInt;
	}

	public void izvrsiAkciju(VideoPlayer vp) {
		double kvalitetVidea = brzinaInt * 10.1;
		if (this.brzinaInt == 5) {
			vp.setKvalitetVidea(144);
		} else if (this.brzinaInt == 10) {
			vp.setKvalitetVidea(240);
		} else if (this.brzinaInt == 15) {
			vp.setKvalitetVidea(360);
		} else if (this.brzinaInt == 20) {
			vp.setKvalitetVidea(480);
		} else if (this.brzinaInt == 25) {
			vp.setKvalitetVidea(720);
		} else if (this.brzinaInt == 30) {
			vp.setKvalitetVidea(1080);

		}

	}

}
