package personnages;


public class Humain {
	private String nom;
	private int argent;
	private String boissonFavorite;
	protected Humain[] memoire = new Humain[30];
	protected int nbConnaissance = 0;
	
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
	
	private void repondre(Humain humain) {
		humain.direBonjour();
		humain.memoriser(this);
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance<this.memoire.length){
			memoire[nbConnaissance] = humain;
			nbConnaissance ++;
		}
		else {
			for (int i=0; i<nbConnaissance-1; i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[nbConnaissance-1]=humain;
		}
	}
	
	public void listerConnaissance() {
		if (nbConnaissance == 0) {
			parler("Je ne connais personne.");
		}
		else {
			String listeNom = memoire[0].getNom() + ".";
			for (int i=1; i<nbConnaissance; i++) {
				listeNom = memoire[i].getNom() + ", " + listeNom;
			}
			parler("Je connais beaucoup de monde dont: " + listeNom);
		}
	}
	
	public void faireConnaissance(Humain humain) {
		this.direBonjour();
		this.repondre(humain);
		this.memoriser(humain);
	}
}
