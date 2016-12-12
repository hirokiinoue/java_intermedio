package negozio;

public class SchedaVideo extends Articolo {

	double prezzo = 0;
	int benchmark = 0;
	
	/* costruttore */
	public SchedaVideo(String nome, String descrizione, double prezzo,
			int benchmark) {
		/* call Articolo */
		super(nome, descrizione);
		this.prezzo = prezzo;
		this.benchmark = benchmark;
	}

	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return prezzo;
	}

	@Override
	public String scheda() {
		// TODO Auto-generated method stub
		return getNome()+" "+prezzo+" "+benchmark;
	}

}
