package domaci_06_09;

/*U zoovrtu obitavaju razne zivotinje. Sve imaju svoju vrstu (kicmenjaci, beskicmenjaci), konkretan naziv i cime se hrane.
Ribe su kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda), broj peraja, vrsta peraja
Sisari su kicmenjaci koje se razlikuju po boji dlake, nacinu ishrane (biljojedi, mesojedi, svastojedi), i covekovoj podeli na divlje i domace.
Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.
Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
Ispisati bar jedno staniste.
Jednom sisaru zameniti ulogu koju mu je covek dodelio.*/ 

public class GlavnaKlasa {

	public static void main(String[] args) {

		Ribe ribe = new Ribe("Brotfis", "slatkovodna","nije", "5", "bocno, grudno, ledjno, podrepno i repno");
		ribe.stampanje();
		
		Sisari sisari = new Sisari("Vedelova foka", "sive", "mesozder",false, "bocna", "sa strane", "2", "2", "4");
		sisari.stampanje();
		Sisari sisari2 = new Sisari("krava", "plave", "riba", true, "ledjna", "sa strane", "5", "1", "2");
		sisari2.stampanje();
		
		Staniste staniste = new Staniste("Artik", " pingvini ", "morzevi", "narval ", "beluga"  , 
				"njorke");
		staniste.stampanje();
							
	}

}
