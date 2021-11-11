package domaci_06_09;


//Sisari su kicmenjaci koje se razlikuju po boji dlake, nacinu ishrane
	// (biljojedi, mesojedi, svastojedi),
	// i covekovoj podeli na divlje i domace.

public class Sisari extends Ribe {

	private String ime2;
	private String bojaDlake;
	private String nacinIshrane;
	private boolean podela;

	public Sisari(String ime2, String bojaDlake, String nacinIshrane, boolean podela, String ime, String slatkovodna,
			String morska, String brojPeraja, String VrstaPeraja) {
		super(ime, slatkovodna, morska, brojPeraja, VrstaPeraja);

		this.ime2 = ime2;
		this.bojaDlake = bojaDlake;
		this.nacinIshrane = nacinIshrane;
		this.podela = podela;

	}

	public String getIme2() {
		return ime2;
	}

	public void setIme2(String ime2) {
		this.ime2 = ime2;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getNacinIshrane() {
		return nacinIshrane;
	}

	public void setNacinIshrane(String nacinIshrane) {
		this.nacinIshrane = nacinIshrane;
	}

	public boolean isPodela() {
		return podela;
	}

	public void setPodela(boolean podela) {
		this.podela = podela;
	}

	public void stampanje() {
		System.out.println("Ovaj sisar se zove " + ime2 + ", " + bojaDlake + " je boje, " + "ona je " + nacinIshrane
				+ ", zato je  ");
		if (this.podela) {
			System.out.print("domaca ");
		} else {
			System.out.print("divlja ");
		}
		System.out.println("zivotinja." + " Poseduje " + vrstaPeraja + " peraja, od kojih su " + brojPeraja
				+ " prednja i 2 repna.");
		System.out.println();
	}

}
