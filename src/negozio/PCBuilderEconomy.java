package negozio;

public class PCBuilderEconomy implements IPCBuilder {

	PC pc = null;
	
	//Un esempio di builder molto astratto.
	@Override
	public void base() {
		pc = new PC
				(	"Les Miserable",
					"Pc per la mia ex",
					new Processore("Celeron","", 30, 500),
					new Ram("DDR3 SAMSUNG","",30,2,"DD3"),
					new Hd("Hd usato", "",30,500),
					0
				);
	}

	@Override
	public void aggiunteGaming() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aggiunteFinali() {
		// TODO Auto-generated method stub

	}
	
	public PC build()
	{
		return pc;
	}

}