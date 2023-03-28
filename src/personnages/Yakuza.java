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
		this.reputation ++;
		parler("J'ai pique les " + argentExtorquee + " sous de " + nomVictime + ", ce qui me fait " + super.getArgent() + " sous en poche. Hi ! Hi!");
	}
	
	public int perdre() {
		int argentPerdue = super.getArgent();
		super.parler("J'ai perdu mon duel et mes "+ argentPerdue + " sous, snif... J'ai deshonore le clan de " + this.clan +".");
		super.perdreArgent(argentPerdue);
		this.reputation --;
		return argentPerdue;
	}
	
	public void gagner(int gain) {
		parler(" Ce ronin pensait vraiment battre " + super.getNom() + " du clan de Warsong ? Je l'ai depouille de ces " + gain + " sous.");
		this.reputation ++;
		super.gagnerArgent(gain);
	}
	
	public int getReputation() {
		return reputation;
	}
}
