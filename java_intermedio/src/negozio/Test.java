package negozio;

public class Test {

	public static void main(String argv[])
	{
		
		PrototipiConsole pro = new PrototipiConsole();
		
		Console polystation = pro.copia(0);
		Console nesmini		= pro.copia(0);
		
		polystation.setNome("polystation");
		nesmini.setNome("Nes mini");
		
		System.out.println(pro.console[0]);
		System.out.println(pro.console[0].scheda());
		System.out.println(polystation);
		System.out.println(polystation.scheda());
		System.out.println(nesmini);
		System.out.println(nesmini.scheda());
		
		
		
		
		System.exit(-1);
		
		//Rinuncio alla lazy inizialization stavolta...
		Logger log = Logger.getInstance();
		
		Videogame v2 = Videogame.crea("Dishonored", "Stealth", 30, "PC");
		Videogame v3 = Videogame.crea("Deus Ex", "Stealth", 30, "PC");
			

		v2.scheda();
		v3.scheda();
		
		System.out.println(log);
		
		System.exit(-1);
		
		Logger l = Logger.getInstance();
		Logger l2 = Logger.getInstance();
		
		l.add("Evento 1");
		l2.add("Evento 2");
		
		System.out.println("Ciao io sono l!"+l);
		System.out.println("Ciao, io sono l2!"+l2);
		
		
		
		System.exit(-1);
		
		PC p = new PC(
					"PC di prova",
					"Descrizione",
					new Processore("I7","",300,5000),
					new Ram("DD3", "", 40, 4, "veloce"),
					new Hd("HD1", "", 100, 500),
					0
				)
				.setHd2(new Hd("HD2", "", 100, 500))
				.setSchedavideo(new SchedaVideo("NVI", "", 100, 0))
		
		
		;
		
		
		
		System.exit(-1);
		
		//Una factory
		Videogame v = Videogame.crea
				("Dishonored","Stealth" , 25, "PL4");
		
	
		
		
		//System.out.println(v);
		
		IPCBuilder pcb = new PCBuilderGaming();
		
		pcb.base();
		pcb.aggiunteGaming();
		pcb.aggiunteFinali();
		
		
		Console c = new Console("PL4", "Console MS", 269);
		
		
		System.out.println(
			v.compatibile(pcb.build())
				);
		
		System.out.println(
				v.compatibile(c)
					);
			
		
		
		
		
		//System.out.println(pcb.build().scheda());
		
		
		
		//Console c = new Console("Y360", "Console MS", 269);
		
		//System.out.println(v.compatibile(c));
		
		
	}			
	
	
}
