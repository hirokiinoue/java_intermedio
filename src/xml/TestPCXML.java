package xml;

import negozio.PC;
import negozio.Processore;
import negozio.Ram;
import negozio.Hd;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class TestPCXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// file read
		Document dati = AntXML.DocumentDaFile("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\xml\\pc.xml");
		
		// get Elements "pc"
		NodeList pcxml = dati.getElementsByTagName("pc");
		
		// define pc
		PC pc;
		String nomePC = "";
		// define Processore
		Processore processore;
		String nomeProcessore = "";
		double prezzoProcessore = 0;
		int benchmarkProcessore = 0;
		// define Ram
		Ram ram;
		int giga = 0;
		// define Hd
		Hd hd;
		int capacita = 0;
		// define descrizione
		String descrizione = "";
		// define ricarico
		int ricarico = 0;
		
		// pc loop
		for (int i = 0; i<pcxml.getLength();i++){
		
			// get elemets' pc
			NodeList campi = pcxml.item(i).getChildNodes();
			
			// elements loop
			for(int k = 0; k<campi.getLength();k++){
				// switch elements
				switch(campi.item(k).getNodeName())
				{
				case "nome": // name of PC
					nomePC = campi.item(k).getTextContent();
					break;
				case "processore": // name of processor
					nomeProcessore = campi.item(k).getTextContent();
					// switch type of processor
					switch(nomeProcessore){
					case "i3":
						prezzoProcessore = 50.00;
						benchmarkProcessore = 30000;
						break;
					case "i5":
						prezzoProcessore = 70.00;
						benchmarkProcessore = 50000;
						break;
					case "i7":
						prezzoProcessore = 100.00;
						benchmarkProcessore = 100000;
						break;
					case "ATOM":
						prezzoProcessore = 30.00;
						benchmarkProcessore = 10000;
						break;
					default:
						prezzoProcessore = 0.00;
						benchmarkProcessore = 0;
						break;
					}
					break;
				case "ram": // tag ram
					giga = Integer.parseInt(campi.item(k).getTextContent());
					break;
				case "hd": // tag hd
					capacita = Integer.parseInt(campi.item(k).getTextContent());
					break;
				case "descrizione": // tag descrizione
					descrizione = campi.item(k).getTextContent();
					break;
				case "ricarico": // tag option cost
					ricarico = Integer.parseInt(campi.item(k).getTextContent());
					break;
				default:
					break;
				}
			}
			
			
			processore = new Processore(nomeProcessore,"",prezzoProcessore,benchmarkProcessore);
			ram = new Ram("SAMUSUNG","",giga*5,giga,"DDR3");
			hd = new Hd("SanDisk","capacita*0.30=prezzo",capacita*0.30,capacita);
			pc = new PC(nomePC,descrizione,processore,ram,hd,ricarico);
			
			System.out.println(pc.scheda());
		}
	}

}
