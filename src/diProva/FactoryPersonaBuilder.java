package diProva;

public class FactoryPersonaBuilder {

	public static IPersonaBuilder creaBuilder(String tipo)
	{
		IPersonaBuilder p = null;
		if(tipo.equals("Smart")) p =  new SmartPersonaBuilder();
		if(tipo.equals("HTML")) p =  new HTMLPersonaBuilder();
		if(tipo.equals("Plain")) p =  new PersonaBuilder();
				
		return p;
		
	}
	
}
