package duello;

public class Arma extends Carta {
	
	private int modcorpo;
	private int modfuoco;
		
	public int getModcorpo() {
		return modcorpo;
	}

	public void setModcorpo(int modcorpo) {
		this.modcorpo = modcorpo;
	}

	public int getModfuoco() {
		return modfuoco;
	}

	public void setModfuoco(int modfuoco) {
		this.modfuoco = modfuoco;
	}

	public Arma(String titolo, String testo, int modcorpo, int modfuoco)
	{
		super(titolo,testo);
		this.modcorpo = modcorpo;
		this.modfuoco = modfuoco;
	}
	
	public Arma(String titolo, String testo,String team, int modcorpo, int modfuoco)
	{
		super(titolo,testo);
		this.modcorpo = modcorpo;
		this.modfuoco = modfuoco;
		setTeam(team);
	}
	
	
	public String scheda()
	{
		return 	super.scheda()	+	"\n"			+
				"Mod corpo:"	+	modcorpo +"\n"	+
				"Mod fuoco:"	+	modfuoco		;
		
	}
	
	public int prezzo()
	{
		return modfuoco+modcorpo;		
	}
	
}
