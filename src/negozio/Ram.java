package negozio;

public class Ram extends Articolo {

	double prezzo ;
	String tipo;
	int giga=0;

	/* costruttore */
	public Ram(String nome, String descrizione, double prezzo, int giga,String tipo) {
		/* call Articolo */
		super(nome, descrizione);
		this.prezzo = prezzo;
		this.tipo = tipo;
		this.giga = giga;
	}

	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return prezzo;
	}

	@Override
	public String scheda() {
		// TODO Auto-generated method stub
		return tipo+" "+giga;
	}

	public String toXML(){
		return "<ram>"+"\n\t<nome>"+getNome()+"</nome>"+"\n\t<giga>"+giga+"</giga>"+"\n</ram>";
	}
}
