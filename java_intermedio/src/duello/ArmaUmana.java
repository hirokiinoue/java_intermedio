package duello;

public class ArmaUmana extends Arma {

	//Le armi umane possono essere usate solo dagli umani (tutti tranne i venom)
	
	//Costruttore senza tipo specificato
	public ArmaUmana(String titolo, String testo, int modcorpo, int modfuoco)
	{
		//Questo � il costruttore della classe ARMA! Non pi� di carta...
		super(titolo,testo,modcorpo,modfuoco);
		//Se non lo specifico, il team � generico.
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
		//Questo � il costruttore della classe ARMA! Non pi� di carta...
		super(titolo,testo,modcorpo,modfuoco);
		setTeam("G");
	}
	
	

	
	
	
}
