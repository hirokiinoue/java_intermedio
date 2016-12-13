package negozio;

public class FacadeListaDoni {

	public String listaDoni(String sesso, double budget)
	{
		//Immaginiamo che sia una funzione comune...
		//Facciamo finta che...
		Articolo a = null;
		String ris = "";
		//Ripeto fin tanto che budget è > 0
		while (budget>0)
		{
			a = Articolo.casuale();
			budget-=a.getPrezzo();
			ris+=a.scheda()+"\n";
		}
		return ris;
	}
}
