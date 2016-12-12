package duello;

//Vedremo che questa classe verrà riscritta...

public class Mazzo {

	Carta[] carte;
	
	
	
	public Mazzo(Carta[] carte)
	{
		this.carte = carte;		
	}
	
	//Primo caso: estraggo a caso
	public Carta estrai()
	{
		return carte[(int)(Math.random()*carte.length)];
	}

	public Guerriero estraiGuerriero()
	{
		Guerriero g = null;
		Carta c = null;
		if(nGuerrieri()>0)
		{
			while(g==null)
			{
				c = estrai();
				// La carta che ho estratto è un guerriero. In questo caso
				// mi fermo. Altrimenti continuo.
				if(c instanceof Guerriero) g = (Guerriero) c;
			}
		}
		
		g.rigenera();
		return g;
	}

	
	public int nGuerrieri()
	{
		int ris = 0;
		for(int i=0;i<carte.length;i++)
			if(carte[i] instanceof Guerriero) ris++;
		return ris;
	}
	
	
}
