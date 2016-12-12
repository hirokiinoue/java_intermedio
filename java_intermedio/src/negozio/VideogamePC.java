package negozio;

public class VideogamePC extends Videogame {

	/* costruttore */
	public VideogamePC(String nome, String descrizione, double prezzo)
	{
		/* call Videogame */
		super(nome,descrizione,prezzo,"PC");
	}

	
	public boolean compatibile(Articolo piattaforma)
	{
		return piattaforma instanceof PC;
	}
	
	@Override
	public String scheda() {
		// TODO Auto-generated method stub
		
		return super.scheda();
	}

}
