package diProva;

public class SmartPersonaBuilder implements IPersonaBuilder {

	private Persona p = null;
	
	public SmartPersonaBuilder()
	{
		p = new Persona();
	}
	
	
	public void setAnagrafica(String nome, String cognome)
	{
		p.setNome(nome).setCognome(cognome);
	}

	public void setEta(int eta)
	{
		p.setEta(eta);
	}
	
	public void setStatura(int statura)
	{
		p.setStatura(statura);
		if(p.getPeso()==0)p.setPeso(statura-100);
	}
	

	public Persona build()
	{
		return p;		
	}
	
}
