package personnages;

public class Ronin extends Humain {
	private int honneur=1;

	public Ronin(String nom, int argent, String boissonFavorite) {
		super(nom, argent, boissonFavorite);
	}
	
	public void donner(Commerçant beneficiaire) {
		int don = super.getArgent()/10;
		super.perdreArgent(don);
		super.parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}
}
