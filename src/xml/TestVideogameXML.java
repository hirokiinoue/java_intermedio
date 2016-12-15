package xml;

import negozio.Videogame;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class TestVideogameXML {

	public static void main(String argv[]){
		Document dati = AntXML.DocumentDaFile("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\xml\\pc.xml");
		
		NodeList videogamexml = dati.getElementsByTagName("videogame");
		Videogame vg;
		String nome;
		String descrizione;
		int prezzo;
		
		for(int i = 0; i <videogamexml.getLength(); i++){
			NodeList campi = videogamexml.item(i).getChildNodes();
			for(int k=0;k<campi.getLength();k++)
			{
				switch(campi.item(k).getNodeName())
				{
				case "titolo":
					nome = campi.item(k).getTextContent();
					break;
				case "descrizione":
					descrizione = campi.item(k).getTextContent();
					break;
				case "prezzo":
					prezzo = Integer.parseInt(campi.item(k).getTextContent());
					break;
				default:
					break;
				}
				//Ho finito di scorrere i campi...
				vg = new VideogamePC(nome,descrizione,prezzo);
				System.out.println(vg.scheda());
			}
		}
	}
}
