package personnages;

public class Commerçant extends Humain {

	public Commerçant(String nom, int argent) {
		super(nom, argent, "the");
	}
	
	public void recevoir(int don) {
		super.gagnerArgent(don);
		super.parler(don + " sous ! Je te remercie genereux donateur !");
	}
	
	public int seFaireExtorquer() {
		int argentPerdue = super.getArgent();
		super.perdreArgent(argentPerdue);
		super.parler("J'ai tout perdu ! Le monde est trop injuste...");
		return argentPerdue;
	}
	
	
}
