package histoire;

import personnages.Commerçant;
import personnages.GrandMere;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
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
		
		Samourai akimoto = new Samourai("Akimoto", 80, "sake", "Miyamoto");
		akimoto.faireConnaissance(marco);
		akimoto.listerConnaissance();
		akimoto.boire();
		akimoto.boire("the");
		
		Traitre masako = new Traitre("Masako", 100, "whisky", "Miyamoto");
		
		System.out.println("\n");
		
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaissance(masako);
		masako.ranconner(kumi);
		masako.faireConnaissance(yaku);
		masako.faireLeGentil();
		masako.faireConnaissance(roro);
		
		System.out.println("\n");

		
		GrandMere grandMere = new GrandMere("Grand-Mere", 10);
		grandMere.faireConnaissance(akimoto);
		grandMere.faireConnaissance(yaku);
		grandMere.faireConnaissance(masako);
		grandMere.faireConnaissance(kumi);
		grandMere.faireConnaissance(marco);
		grandMere.faireConnaissance(chonin);
		grandMere.ragoter();
	}
	

}
