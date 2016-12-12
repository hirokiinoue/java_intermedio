package diProva;

public class PersonaBuilder implements IPersonaBuilder{

	private Persona p = null;
	
	public PersonaBuilder()
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
	}
	

	public Persona build()
	{
		return p;		
	}
	
}
