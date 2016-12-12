package negozio;

public class PrototipiProcessore {

	Processore[] processore = new Processore[3];
	
	/* costruttore */
	public PrototipiProcessore()
	{
		processore[0] = new Processore("intel Core i3 6100","3MB Cache",105.83,3700);
		processore[1] = new Processore("intel Core i5 4440","6MB Cache",165.50,3100);
		processore[2] = new Processore("intel Core i7 3770","8MB Cache",280.54,3400);
	}
	
	public Processore copia(int p) {
		
		return (Processore) processore[p].clone();
	}
}
