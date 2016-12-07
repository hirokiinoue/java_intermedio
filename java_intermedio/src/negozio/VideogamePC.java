package negozio;

public class VideogamePC extends Videogame {

	
	public VideogamePC(String nome, String descrizione, double prezzo)
	{
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
