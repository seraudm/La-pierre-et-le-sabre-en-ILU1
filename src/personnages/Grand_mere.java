package personnages;

public class Grand_mere extends Humain{
	
	private enum TypeHumain{
		HABITANT("habitant"), RONIN("ronin"), YAKUZA("yakuza"), COMMERCANT("commercant"), SAMOURAI("samourai"), TRAITRE("traitre");
		
		private String nom;
		
		private TypeHumain(String nom) {
			this.nom = nom;
		}
		
		@Override
		public String toString() {
			return nom;
		}
	}
	
	public Grand_mere(String nom, int argent) {
		super(nom, argent, "tisane");
	}
	
	@Override
	protected void memoriser(Humain humain) {
		if (nbConnaissance<5){
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
	
	private String humainHasard() {
		//TO DO
		return "";
	}

}
