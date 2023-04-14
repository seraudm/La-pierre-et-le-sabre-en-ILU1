package histoire;

import personnages.Commerçant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commerçant marco =  new Commerçant("Marco", 20);
		Commerçant chonin = new Commerçant("Chonin", 40);
		Commerçant kumi = new Commerçant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", 30, "whisky", "Warsong");
		Ronin roro = new Ronin("Roro", 60, "shochu");
		
		marco.faireConnaissance(roro);
		marco.faireConnaissance(yaku);
		marco.faireConnaissance(chonin);
		marco.faireConnaissance(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
	}

}
