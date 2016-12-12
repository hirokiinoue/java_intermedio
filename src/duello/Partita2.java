package duello;

//Anche lui implementa partita, ma aggiunge qualcosa.

public class Partita2 implements IPartita{

	//I mazzi da cui pesco
	Mazzo m1;
	Mazzo m2;
	//I due guerrieri sul tavolo
	Guerriero g1;
	Guerriero g2;
	//I punteggi della partita
	int punteggio1=0;
	int punteggio2=0;
	
	public Partita2(Carta [] vmazzo1, Carta [] vmazzo2) 
	{
		//Preparo i mazzi.
		m1 = new Mazzo(vmazzo1);
		m2 = new Mazzo(vmazzo2);
		//ed estraggo due guerrieri
		g1 =  m1.estraiGuerriero();
		g2 =  m2.estraiGuerriero();
		g1.setArma(m1.estrai());
		g2.setArma(m2.estrai());
		
		//Sono pronto a partire! Tutto il resto è già inizializzato
	}

	//Un metodo interessante!
	//Cambia lo stato di diversi oggetti e restituisce una stringa da stampare.
	public String resocontoScontro()
	{
		//Due variabili locali, quindi temporanee...
		int attacco1=0, attacco2=0;
		String tipo = Math.random()<0.5 ? "C" : "F";
		String ris = "Si sffrontano:\t" + g1.getNome() + " \t e \t " + g2.getNome() + "\n";
		ris+="Armati di:\t"+g1.getArma().getNome()+" \t e \t "+g2.getArma().getNome()+"\n";
		if(tipo.equals("C"))
		{
			attacco1 = g1.getCorpo();
			attacco2 = g2.getCorpo();
			ris+="Scontro corpo a corpo! \n";
		}
		else
		{
			attacco1 = g1.getFuoco();
			attacco2 = g2.getFuoco();
			ris+="Scontro a fuoco! \n";
		}
		
		
		
		if(attacco1>=g2.getDifesa())
		{
			ris+=g2.getNome()+" è stato ferito! \n";
			g2.ferisci();
			punteggio1++;
		}
		else
		{
			ris+=g2.getNome()+" non ha riportato danni! \n";
		}

		if(attacco2>=g1.getDifesa())
		{
			ris+=g1.getNome()+" è stato ferito! \n";
			g1.ferisci();
			punteggio2++;
		}
		else
		{
			ris+=g1.getNome()+" non ha riportato danni! \n";
		}
		
		//In tutti i casi, devo "invecchiare" i due guerrieri
		g1.eta++;
		g2.eta++;
		
		return ris;
	}
	
	
	public String resocontoTurno(int turno)
	{
		String ris = "";
		//Per ora facciamo finta che g1 e g2 possano combattere
		ris+="Si gioca il turno "+turno+"\n";
		ris+="=============================================\n";
		
		//Scontro! il cuore del lavoro...
		ris+=resocontoScontro();
				
		if(g1.eMorto()) ris+=g1.getNome()+" ci ha lasciati.\n";
		if(g2.eMorto()) ris+=g2.getNome()+" ci ha lasciati.\n";
		
		if(!g1.eMorto() && g1.eRitirato()) ris+=g1.getNome()+ " combatte da troppo. Ritirato!\n";
		if(!g2.eMorto() && g2.eRitirato()) ris+=g2.getNome()+ " combatte da troppo. Ritirato!\n";
		
		ris+="Situazione attuale:"+punteggio1+"-"+punteggio2+"\n";
		if(g1.eMorto() || g1.eRitirato()) 
		{	
			g1 = m1.estraiGuerriero();
			g1.setArma(m1.estrai());
		}	
		if(g2.eMorto() || g2.eRitirato()) 
		{
			g2 = m2.estraiGuerriero();
			g2.setArma(m2.estrai());
		}
		
		ris+="=============================================\n";
		
		//Resoconto del turno
		return ris;
	}

	public String resoconto(int turni)
	{
		String ris = "";
		for(int i=1;i<=turni;i++)
		{
			//Ciclo principale
			ris+=(resocontoTurno(i)+"\n");
		}
		ris+=("Risultati finali ");
		ris+=("Giocatore 1 :"+punteggio1);
		ris+=("Giocatore 2 :"+punteggio2);
		return ris;

	}
	
	
}
