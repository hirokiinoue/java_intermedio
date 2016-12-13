package negozio;

public class listaDoni {

	
	public listaDoni(){
		
	}
	
	public String crea(String sesso, double budget)
	{
		//Immaginiamo che sia una funzione comune...
		//Facciamo finta che...
		Articolo a = null;
		CacheDoni cacheDoni = new CacheDoni();
		int i = 0;
		String ris = "";
		//Ripeto fin tanto che budget è > 0
		while (budget>0)
		{
			switch(sesso)
			{
			case "":
			}
			a = cacheDoni.doni.get(i);
			budget-=a.getPrezzo();
			ris+=a.scheda()+"\n";
			i++;
		}
		return ris;
	}

}
