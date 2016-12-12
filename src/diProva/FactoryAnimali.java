
package diProva;

public class FactoryAnimali {

	public static Animale creaAnimale(String tipo)
	{
		Animale a = null;
		switch(tipo)
		{
		case "Ghepardo":
			a = new Ghepardo();
			break;
		case "Java":
			a = new DocenteJava();
			break;
		default:
			a = null;
		}
		
		return a;
	}
	
	
}
