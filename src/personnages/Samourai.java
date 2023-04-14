package personnages;

public class Samourai extends Ronin{
	private String seigneur;

	public Samourai(String nom, int argent, String boissonFavorite, String seigneur) {
		super(nom, argent, boissonFavorite);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur + ".");
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson? Tiens je vais prendre du " + boisson + ".");
	}

}
