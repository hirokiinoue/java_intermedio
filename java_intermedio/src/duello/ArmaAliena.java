package duello;

public class ArmaAliena extends Arma {

	//Costruttore. Il tipo � automaticamente Venom, questa � una arma aliena
	public ArmaAliena(String titolo, String testo, int modcorpo, int modfuoco)
	{
		//Questo � il costruttore della classe ARMA! Non pi� di carta...
		super(titolo,testo,modcorpo,modfuoco);
		//Team non � pubblico. Lo devo impostare a parte...
		setTeam("V");
	}

	
	
}
