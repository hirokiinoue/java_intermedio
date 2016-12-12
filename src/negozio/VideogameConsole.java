package negozio;

public class VideogameConsole extends Videogame {

	/* costruttore */
	public VideogameConsole(String nome, String descrizione, double prezzo, String piattaforma)
	{
		/* call Videogame */
		super(nome,descrizione,prezzo,piattaforma);
	}

	public String scheda()
	{
		return toString();
	}
	
	public boolean compatibile(Articolo piattaforma)
	{
		return (piattaforma.getNome()==getPiattaforma());
	}
		
	@Override
	public String toString() {
		return "VideogameConsole [getPiattaforma()=" + getPiattaforma()
				+ ", getPrezzo()=" + getPrezzo() + ", getNome()=" + getNome()
				+ ", getDescrizione()=" + getDescrizione() + "]";
	}	
}

