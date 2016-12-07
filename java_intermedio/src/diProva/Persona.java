package diProva;

public class Persona {

	String nome;
	String cognome;
	int eta;
	int statura;
	int peso;
	
	public Persona(){};
	
	//SOLO I DATI OBBLIGATORI
	public Persona(String nome, String cognome)
	{
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	//FLUENT
	public Persona setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getCognome() {
		return cognome;
	}

	public Persona setCognome(String cognome) {
		this.cognome = cognome;
		return this;
	}

	public int getEta() {
		return eta;
	}

	public Persona setEta(int eta) {
		this.eta = eta;
		return this;
	}

	public int getStatura() {
		return statura;
	}

	public Persona setStatura(int statura) {
		this.statura = statura;
		return this;
	}

	public int getPeso() {
		return peso;
	}

	public Persona setPeso(int peso) {
		this.peso = peso;
		return this;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta="
				+ eta + ", statura=" + statura + ", peso=" + peso + "]";
	}
	
	
	
	
}
