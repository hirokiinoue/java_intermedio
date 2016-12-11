package duello;

public class TestCambiOggetto {

	public static void main(String[] args) {

		Mazzo m = 
				new Mazzo
				(
						new Carta[]
						{
							new Guerriero("Corvo Cecchino","C", "Tiratore scelto",2,5,3,3),
							new Guerriero("Orso Rosso","U", "Esperto di mischia",5,2,5,3),
							new ArmaUmana("Arma 1", "Test1", "V", 2, 2),
							new ArmaAliena("Arma aliena 1", "Test1", 2, 2),
							
						}				
				);
		
		Carta c 		= 	m.estraiGuerriero();
		System.out.println("La scheda di c:\n"+c.scheda());
		Guerriero g 	= 	(Guerriero) c;
		System.out.println("La scheda di g:\n"+g.scheda());
		
		//Cambio c
		c.setTeam("K");
		System.out.println("La scheda di g ora...\n"+g.scheda());
		
		
		
		
	}

}
