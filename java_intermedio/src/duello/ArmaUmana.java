package duello;

public class ArmaUmana extends Arma {

	//Le armi umane possono essere usate solo dagli umani (tutti tranne i venom)
	
	//Costruttore senza tipo specificato
	public ArmaUmana(String titolo, String testo, int modcorpo, int modfuoco)
	{
		//Questo è il costruttore della classe ARMA! Non più di carta...
		super(titolo,testo,modcorpo,modfuoco);
		//Se non lo specifico, il team è generico.
		setTeam("G");
	}
	
	public ArmaUmana(String titolo, String testo,String team, int modcorpo, int modfuoco)
	{
		super(titolo,testo,modcorpo,modfuoco);
		setTeam(team);
	}

	
	//Costruttore per specificare il tipo
	public ArmaUmana(String titolo, String testo, int modcorpo, int modfuoco,String team)
	{
		//Questo è il costruttore della classe ARMA! Non più di carta...
		super(titolo,testo,modcorpo,modfuoco);
		setTeam("G");
	}
	
	

	
	
	
}
