package duello;

public class ArmaAliena extends Arma {

	//Costruttore. Il tipo è automaticamente Venom, questa è una arma aliena
	public ArmaAliena(String titolo, String testo, int modcorpo, int modfuoco)
	{
		//Questo è il costruttore della classe ARMA! Non più di carta...
		super(titolo,testo,modcorpo,modfuoco);
		//Team non è pubblico. Lo devo impostare a parte...
		setTeam("V");
	}

	
	
}
