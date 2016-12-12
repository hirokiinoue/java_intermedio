package duello;

public class TestDuello05 {

	public static void main(String[] args){

		//Usa una interfaccia.
		IPartita p = 
				new Partita
				(
						new Carta[]
						{
							new Guerriero("Corvo Cecchino","C", "Tiratore scelto",2,5,3,3),
							new Guerriero("Orso Rosso","U", "Esperto di mischia",5,2,5,3),
							new ArmaUmana("Arma 1", "Test1", "V", 2, 2),
							new ArmaAliena("Arma aliena 1", "Test1", 2, 2),
							
						},
						new Carta[]
						{
								new Guerriero("Corvo Cecchino","C", "Tiratore scelto",2,5,3,3),
								new Guerriero("Orso Rosso","U", "Esperto di mischia",5,2,5,3),
								new ArmaUmana("Arma 1", "Test1", "V", 2, 2),
								new ArmaAliena("Arma aliena 1", "Test1", 2, 2)
						}				
				);
		System.out.println(p.resoconto(5));
	}

}
