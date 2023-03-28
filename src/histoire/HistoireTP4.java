package histoire;

import personnages.Commerçant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", 54, "kombusha");
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		
		Commerçant marco = new Commerçant("Marco", 15);
		marco.direBonjour();
		
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", 30, "whisky", "Warsong");
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquerArgent(marco);
	}

}
