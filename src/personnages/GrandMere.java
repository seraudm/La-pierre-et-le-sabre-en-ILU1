package personnages;

import java.util.Random;

public class GrandMere extends Humain{
	
	private enum TypeHumain{
		HABITANT("un habitant"), RONIN("un ronin"), YAKUZA("un yakuza"), COMMERCANT("un commercant"), SAMOURAI("un samourai"), TRAITRE("un traitre"), GRAND_MERE("une grand-mere");
		
		private String nom;
		
		private TypeHumain(String nom) {
			this.nom = nom;
		}
		
		@Override
		public String toString() {
			return nom;
		}
	}
	
	public GrandMere(String nom, int argent) {
		super(nom, argent, "tisane");
	}
	
	@Override
	protected void memoriser(Humain humain) {
		if (nbConnaissance<5){
			memoire[nbConnaissance] = humain;
			nbConnaissance ++;
		}
		else {
			parler("Oh ma tete ! Je ne peux plus retenir le nom d'une personne supplementaire !");
		}
	}
	
	private String humainHasard() {
		TypeHumain[] types = TypeHumain.values();
		Random r = new Random();
		int indice = r.nextInt(types.length);
		return types[indice].toString();
	}
	
	public void ragoter() {
		for (int i=0; i<nbConnaissance; i++) {
			if (memoire[i] instanceof Traitre) {
				parler("Je sais que " + memoire[i].getNom() + " est un traitre. Petit chenapan !");
			}
			else {
				parler("Je crois que " + memoire[i].getNom() +" est " + humainHasard());
			}
		}
	}

}
