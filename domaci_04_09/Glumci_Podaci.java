package Domaci1.domaci_04_09;

import java.util.ArrayList;

public class Glumci_Podaci {
    public static void main(String[] args) {

        Zadatak_Glumci glumac = new Zadatak_Glumci();

        glumac.imeGlumca = "Edvard";
        glumac.prezimeGlumca = "Norton";
        glumac.rodjen = 1969;
        glumac.polGlumca = "male";
        glumac.setBracniStatus(true);
        glumac.setSnimljeniFilmovi("47");
        glumac.setProsecnaZarada(6382978);
        glumac.ukupniPrihod = "300 milions";
        glumac.sledeceGodine = 53;

        glumac.ispisPodataka();
        ArrayList<String> nazivFilma = new ArrayList<String>();
        nazivFilma.add(" -Primal Fear, IMDB rating - 7.7");
        nazivFilma.add(" -American history X, IMDB rating - 8.5");
        nazivFilma.add(" -Fight Club, IMDB rating - 8.8");
        nazivFilma.add(" -Red Dragon, IMDB rating - 7.2");
        nazivFilma.add(" -Italian Job, IMDB rating - 7.0");

        String zamena = nazivFilma.get(0);

        nazivFilma.set(0, nazivFilma.get(4));// Italian job postavljen na poziciju 0;
        nazivFilma.set(4, zamena);
        zamena = nazivFilma.get(1);

        nazivFilma.set(1, nazivFilma.get(3)); // Red Dragon postavljen na poziciju 1;
        nazivFilma.set(3, zamena);
        zamena = nazivFilma.get(2);

        nazivFilma.set(2, nazivFilma.get(4)); // Primal Fear postavljen na poziciju 2;
        nazivFilma.set(4, zamena);
        zamena = nazivFilma.get(4);

        nazivFilma.set(4, nazivFilma.get(4)); // American history X postavljen na poziciju 3;
        nazivFilma.set(4, zamena);
        zamena = nazivFilma.get(4);

        for (int i = 0; i < nazivFilma.size(); i++) {

            System.out.println(nazivFilma.get(i));

        }

    }
}
