package negozio;

public abstract class Pubblicazione extends Articolo {

	String anno;
	double prezzo;
	String autore;
	String casatrice;
	
	/* costruttore */
	public Pubblicazione(String nome, String descrizione, double prezzo)
	{
		/* call Articolo */
		super(nome, descrizione);
		this.prezzo = prezzo;
		
	}
	
	public Pubblicazione crea(String nome, String descrizione, String categoria, double prezzo)
	{
		
		Pubblicazione p = null;
		
		switch(categoria)
		{
		case "P":
			p = new PubblicazionePeriodico(nome, descrizione, prezzo);
			break;
		case "L":
			p = new PubblicazioneLibro(nome, descrizione, prezzo);
			break;
		default:
			p = null;
		}
		
		return p;
	}
	
	public double getPrezzo()
	{
		return this.prezzo;
	}
	
	public String scheda()
	{
		return getNome()+" "+getPrezzo();
	}
}
