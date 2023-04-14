package personnages;

import java.util.Random;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;	
	
	public Traitre(String nom, int argent, String boissonFavorite, String seigneur) {
		super(nom, argent, boissonFavorite, seigneur);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traitre et mon niveau de traitrise est: " + niveauTraitrise + ". Chut!");
	}
	
	public void ranconner(Commerçant commercant){
		if(niveauTraitrise<3) {
			int argentRanconner = commercant.getArgent() * 2/10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			niveauTraitrise ++;
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " + argentRanconner + " sous ou gare a toi !");
			commercant.parler("Tout de suite grand " + this.getNom() + ".");
		} else {
			this.parler("Mince je ne peux plus ranconner persnne sinon un samourai risque de me demasquer !");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance<1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			Random r = new Random();
			int indiceConnaissance = r.nextInt(nbConnaissance);
			int don = this.getArgent() * 1/20;
			Humain ami = memoire[indiceConnaissance];
			String nomAmi = ami.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			ami.parler("Merci" + this.getNom() + ". Vous etes quelqu'un de bien.");
			
			if (niveauTraitrise > 0) {
				niveauTraitrise --;
			}
		}
	}
}
