package duello;

//La nostra classe "radice" per quasi tutte le altre classi
//Una Carta è "qualunque cosa possa essere messa in campo"
//Per cui 

//Una classe abstract ora!
public abstract class Carta {

	private String nome="Sconosciuto";
	private String team="G";
	private String testo ="Testo della carta";

	// TUTTI possono chiedere il nome
	public String getNome() {
		return nome;
	}
	//Ma una volta impostato è finita...
	
	public String getTeam() {
		return team;
	}
	
	//Le classi figlie possono farlo... e in generale nel package.
	//E' MOLTO simile alla visibilità di default
	//ma permette una migliore estensibilità in altri package
	protected void setTeam(String team) {
		this.team = team;
	}
	
	public String getTesto() {
		return testo;
	}
	
	protected void setTesto(String testo) {
		this.testo = testo;
	}

	
	
	public Carta(){}
	//Il nostro primo costruttore!
	//Notate che manca int, string, double... ecc.. "Carta" è il mio tipo di variabile
	//Costruisce se stesso
	public Carta (String nome, String testo)
	{
		//this = l'oggetto corrente
		//Notare che il tipo viene lasciato non definito
		this.nome = nome;
		this.testo = testo;
	}
	
	public String scheda()
	{
		return nome+"\n"+testo;
	}
	
	public String nometeam()
	{
		String ris = "Generico";
		if(team.equals("V")) ris = "Venom";
		if(team.equals("C")) ris = "Corax";
		if(team.equals("U")) ris = "Ursus";
		if(team.equals("L")) ris = "Lupus";
		if(team.equals("P")) ris = "Pacem";
		return ris;
	}
	
	public String scheda(String intestazione)
	{
		return intestazione+scheda();		
	}
	
	//Il nostro primo metodo astratto!
	public abstract int prezzo();
	
	
	
}
