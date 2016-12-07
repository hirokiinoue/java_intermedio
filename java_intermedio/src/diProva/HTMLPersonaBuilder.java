package diProva;

public class HTMLPersonaBuilder implements IPersonaBuilder {

	private Persona p = null;
	
	public HTMLPersonaBuilder()
	{
		p = new Persona();
	}
	
	
	public void setAnagrafica(String nome, String cognome)
	{
		p.setNome("<h1>"+nome+"</h1>").setCognome("<h1>"+cognome+"</h1>");
	}

	public void setEta(int eta)
	{
		p.setEta(eta);
	}
	
	public void setStatura(int statura)
	{
		p.setStatura(statura);
	}
	

	public Persona build()
	{
		return p;		
	}
	
}
