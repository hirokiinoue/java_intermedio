package diProva;

public abstract class Animale {

	public String specie;
	
	public Animale(String specie)
	{
		this.specie = specie;
		
	}
		
	public abstract String movimento();
	
	
}
