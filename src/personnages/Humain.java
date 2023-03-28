package personnages;


public class Humain {
	private String nom;
	private int argent;
	private String boissonFavorite;
	
	public Humain(String nom, int argent, String boissonFavorite) {
		super();
		this.nom = nom;
		this.argent = argent;
		this.boissonFavorite = boissonFavorite;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {	
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFavorite + ".");
	}

	protected void parler(String texte) {
		System.out.println("(" + this.nom + ") - " +texte);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + this.boissonFavorite + " ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		assert gain >= 0;
		this.argent += gain;
	}
	
	public void perdreArgent(int perte) {
		assert perte >= 0;
		this.argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (prix > this.argent) {
			parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux pas m'offrir un " + bien + " a " + prix +" sous.");
		}
		else {
			parler("J'ai " + this.argent + " sous en poche. Je vais m'offrir un " + bien + " a " + prix +" sous.");
			perdreArgent(prix);
		}
	}
}
