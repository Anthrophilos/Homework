package Domaci1.domaci_04_09;

public class Zadatak_Glumci {
    /*
      Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina
      rodjenja, pol. Private atributi su: da li su ozenjeni ili udati (boolean),
      prosecna zarada po filmu, broj snimljenih filmova. Potrebno je izracunati i
      odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko
      godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena
      da se doda "Mr." ili "Mrs." ako su zenskog pola. Nakon toga napraviti Array
      listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova
      napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore
      ocenjenog filma od tih pet (preko getera i setera).
     */

    public String imeGlumca;
    public String prezimeGlumca;
    public int rodjen;
    public String polGlumca;
    private boolean bracniStatus;
    private String snimljeniFilmovi;
    private int prosecnaZarada;
    public String ukupniPrihod;
    public int sledeceGodine;

    public void ispisPodataka() {

        if (polGlumca.equalsIgnoreCase("male")) {

            System.out.println(" Actors name is Mr " + imeGlumca + ", and Surname is " + prezimeGlumca + ", born in "
                    + rodjen + " as a " + polGlumca + "." + "\n Is it true that he is merried? It's " + bracniStatus
                    + ". " + "\n" + "" + " Filmography: " + snimljeniFilmovi + " credits." + "\n" + " Average salary"
                    + " per movie: " + prosecnaZarada + " $." + "\n" + " His estimated fortune is about: "
                    + ukupniPrihod + " $." + "\n" + " Next year he will be " + sledeceGodine + " old." + "\n"
                    + " Some of his early masterpieces are: ");
        } else {

            System.out.println(" Actors name is Mrs " + imeGlumca + ", and Surname is " + prezimeGlumca + ", born in "
                    + rodjen + " as a " + polGlumca + "." + "\n Is it true that she is merried? Yes, it's "
                    + bracniStatus + "." + "\n" + "" + " Filmography: " + snimljeniFilmovi + " credits." + "\n"
                    + " Average salary" + " per movie: " + prosecnaZarada + " $." + "  estimated fortune is about: "
                    + ukupniPrihod + " $." + "\n" + " Next year she will be " + sledeceGodine + " old.");

        }
    }

    public void setBracniStatus(boolean bracniStatus) {
        this.bracniStatus = bracniStatus;

    }

    public boolean getBracniStatus() {
        return this.bracniStatus;
    }

    public void setSnimljeniFilmovi(String snimljeniFilmovi) {

        this.snimljeniFilmovi = snimljeniFilmovi;
    }

    public String getSnimljeniFilmovi() {
        return this.snimljeniFilmovi;
    }

    public void setProsecnaZarada(int prosecnaZarada) {
        this.prosecnaZarada = prosecnaZarada;
    }

    public int getProsecnaZarada() {
        return this.prosecnaZarada;
    }
}
