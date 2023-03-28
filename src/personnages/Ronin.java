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
	
	public void provoquer(Yakuza adversaire) {
		super.parler("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand !");
		
		if (honneur>= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakuza !");
			this.honneur ++;
			super.gagnerArgent(adversaire.perdre());
		}
		else {
			int argentPerdue = super.getArgent();
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			this.honneur --;
			adversaire.gagner(argentPerdue);
			super.perdreArgent(argentPerdue);
		}
	}
}
