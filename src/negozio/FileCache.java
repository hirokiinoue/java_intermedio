package negozio;
import java.util.*;

//PROXY
public class FileCache implements IArchivioFile {

	ArrayList<FileCachato> cache = new ArrayList<FileCachato>();
	private IArchivioFile archivio;
	
	public FileCache(IArchivioFile archivio){
		this.archivio = archivio;
	}
	
	public String leggi(String percorso){
		String ris = "";
		FileCachato f2;
		for(FileCachato f:cache)
			if(f.percorso.equals(percorso))
			{
				System.out.println("restituisco la versione in cache");
				ris = f.getContenuto();
				break;
			}
		if(ris.equals("")){
			//OK, è un file nuovo
			f2 = new FileCachato(percorso, archivio.leggi(percorso));
			cache.add(f2);
			ris = f2.getContenuto();
		}
		return ris;
	}
}