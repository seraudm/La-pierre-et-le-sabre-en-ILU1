package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, int argent, String boissonFavorite, String clan) {
		super(nom, argent, boissonFavorite);
		this.clan = clan;
	}
	
	public void extorquerArgent(Commerçant victime) {
		String nomVictime = victime.getNom();
		int argentExtorquee;
		
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(nomVictime + ", si tu tiens a la vie donne moi ta bourse !");
		argentExtorquee = victime.seFaireExtorquer();
		super.gagnerArgent(argentExtorquee);
		this.reputation += 1;
		parler("J'ai pique les " + argentExtorquee + " sous de " + nomVictime + ", ce qui me fait " + super.getArgent() + " sous en poche. Hi ! Hi!");
	}
	

}
