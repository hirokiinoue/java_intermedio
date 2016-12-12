package negozio;

public class Hd extends Articolo {

	double prezzo=0;
	int capacita=0;
	
	
	/* costruttore */
	public Hd(String nome, String descrizione, double prezzo, int capacita) {
		/* call Articolo */
		super(nome, descrizione);
		this.prezzo = prezzo;
		this.capacita = capacita;
	}
	
	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return prezzo;
	}

	@Override
	public String scheda() {
		// TODO Auto-generated method stub
		return getNome()+" "+capacita;
	}

}
