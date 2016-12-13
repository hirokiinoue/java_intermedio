package negozio;

import java.io.InputStream;
import java.util.*;

public class CacheDoni {

	Properties prop = new Properties();
	InputStream input = null;
	
	try {
		input = new FileInputStream("config.properties");
		
		// load a properties file
		prop.load(input);
		
		// get the property value and print in out
		System.out.println();
	} catch (IOException e) {
		
	}
	HashMap<String,ArrayList<Articolo>> doni;

	public CacheDoni(){
		doni = new HashMap<String,ArrayList<Articolo>>();
		add();
	}
	
	public void add(){
		ArrayList<Articolo> doniFemmili = new ArrayList<Articolo>();
		ArrayList<Articolo> doniMaschili = new ArrayList<Articolo>();
		ArrayList<Articolo> doniUnisex = new ArrayList<Articolo>();
		
		doniMaschili.add(new VideogameConsole("PS4","",400.00,"PS4"));
		doniMaschili.add(new VideogameConsole("Wii","",400.00,"Wii"));
		doniMaschili.add(new VideogamePC("pcgame","",100.00));
		doniUnisex.add(new PC("Mac","",new Processore("i5","", 150.00, 3000),new Ram("DDR3","",100.00,4,"DDR3"),new Hd("SAMUSNG","",50.00,1000),200));

		doni.put(FEMMINILE,doniFemmili);
		doni.put(MASCHILE,doniMaschili);
		doni.put(UNISEX, doniUnisex);
		
	}
}
