package diProva;

public interface IPersonaBuilder {

	public Persona build();
	public void setEta(int eta);
	public void setStatura(int statura);
	public void setAnagrafica(String nome, String cognome);
	
}
