package negozio;

public class Console extends Articolo  {

	private double prezzo;

	/* costruttore */
	public Console(String nome, String descrizione, double prezzo) {
		/* call Articolo */
		super(nome, descrizione);
		this.prezzo = prezzo;
	}

	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return prezzo;
	}

	@Override
	public String scheda() {
		// TODO Auto-generated method stub
		return getNome()+ " " + getPrezzo();
	}

}
