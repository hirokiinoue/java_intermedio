package duello;

public class Guerriero extends Carta {

	//Cosa vuol dire questo "private"?
	//Private - NESSUNO può accedere a queste proprietà direttamente
	//A parte l'oggetto stesso
	//E' il massimo incapsulamento
	private int corpo;
	private int difesa;
	private int fuoco;
	private int valore;
	private int salute;
	private Arma arma;
	
	//Rappresenta il numero di turni per cui il guerriero può restare in campo
	public int eta;
	//Per ora è pubblico. Non per molto.



	public Guerriero
	(
			String nome, String team, String testo, 
			int corpo, int fuoco, int difesa, int valore
	)
	{
		//Questo chiama il costruttore di una CARTA!
		super(nome,testo);
		//E il RESTO è quello di un Guerriero.. sfrutto la classe "padre"
		
		//Sono costretto a usare setTeam... team non è più pubblico.
		this.setTeam(team);
		this.corpo = corpo;
		this.fuoco = fuoco;
		this.difesa = difesa;
		this.valore = valore;
		this.salute = 2;
		this.eta = 0;
	}
	
	public void setArma(Carta arma)
	{
		//L'oggetto che ci arriva come arma potrebbe essere in realtà una carta
		//di altro genere
		if (arma instanceof Arma)
			this.arma = (Arma) arma;		
	}
	
	public Arma getArma()
	{
		//Se c'è un'arma la restituisce, altrimenti ne crea una farlocca.
		if(arma==null)
			return new Arma("Nessuna","",0,0);
		else
			return arma;
	}
	
	public String scheda()
	{
		//Il nostro primo override
		return 
			super.scheda()	+	
			"\n" 			+
			//Da chi deriva nometeam??
			nometeam() 		+ "\n" 	+
			"Corpo:"	+	this.corpo	+ "\t" +
			"Fuoco:"	+	this.fuoco	+ "\t" +
			"Difesa:"	+	this.difesa	+ "\t" +
			"Valore:"	+	this.valore + "\n";
	}
	
	public void ferisci()
	{
		//Ci semplifichiamo la vita... abbassiamo solo salute
		//Cosa è questo Regole? Lo vedrete bene in seguito...
		salute-=Regole.DANNOFERITA;
	}
	
	public void rigenera()
	{
		//Rimetto in forze il guerriero e lo ringiovanisco
		salute = 2;
		eta = 0;
	}
	
	public boolean eMorto()
	{
		return salute<=0;
	}
	
	public boolean eRitirato()
	{
		//E' stato più di x turni in gioco
		//Cosa è Regole? Non un oggetto...
		return eta>=Regole.MAXTURNIGUERRIERO;
	}
	
	public int prezzo()
	{
		return fuoco+corpo+difesa;
	}
	
	//La lettura è pubblica. 
	public int getCorpo() {
		if(arma==null)
			return corpo;
		else
			return corpo+arma.getModcorpo();
	}

	public int getDifesa() {
		return difesa;
	}

	public int getFuoco() {
		if(arma==null)
			return fuoco;
		else
			return fuoco+arma.getModfuoco();
	}

	public int getValore() {
		return valore;
	}

	//Leggere da qui in avanti per trovare:
	//Metodi e proprietà statiche (di classe)
	//polimorfismo
	private static String[] ruoliCasuali = new String[]
	{
		"Soldato", 
		"Tenente", 
		"Incursore",
		"Ricognitore"
	};
	
	private static String[] attributiCasuali = new String[]
	{
		"ignifugo",
		"d'assalto",
		"riservista",
		"rosso",
		"nero",
		"bianco"
	};
	
	private static String[] teamCasuali = new String[]
	{
		"P",
		"V",
		"U",
		"L",
		"C"
	};

	
	//Tre metodi "casuale"
	//uno genera una stringa casuale a partire da un vettore di possibilità
	//uno genera un intero casuale a partire da due interi (da, a)
	//uno genera un intero GUERRIERO casuale.
	
	//E non ci serve creare un oggetto guerriero per usarli.
	
	private static String casuale(String[] vettore)
	{
		return vettore[(int)(Math.random()*vettore.length)];
	}
	
	private static int casuale(int da, int a)
	{
		return da + ((int)(Math.random()*(a-da)));
	}
	
	
	public static Guerriero casuale()
	{
		
		// ERROREEEEE: System.out.println(corpo);
		Guerriero g = new Guerriero(
			casuale(ruoliCasuali) + " " + casuale(attributiCasuali),
			casuale(teamCasuali),
			"Guerriero generato casualmente",
			casuale(1,10), 
			casuale(1,10), 
			casuale(1,10), 
			casuale(1,10)
		); 
		return g;
	}

	
}
