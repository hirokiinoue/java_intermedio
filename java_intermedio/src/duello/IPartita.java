package duello;

public interface IPartita {

	// questo è il contratto per "partita"
	// ogni tipo di "Partita" deve rispettare questo contratto
	
	//Potete immaginarlo come una classe completamente astratta.
	
	//A cosa serve? E' un contratto...
	
	public String resocontoScontro();
	
	public String resocontoTurno(int turno);
	
	public String resoconto(int turni);
	
}
