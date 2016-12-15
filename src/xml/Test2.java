package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import negozio.*;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Document dati = AntXML.DocumentDaFile("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\pc.xml");
		NodeList pcxml = dati.getElementsByTagName("pc");
		
		// primo pc
		Node pc1 = pcxml.item(0);
		Processore processore;
		Ram ram;
		
		NodeList campi = pc1.getChildNodes();
		
		for (int i = 0; i<campi.getLength(); i++)
		{
			Node campo = campi.item(i);
			String nome = campo.getNodeName();
			switch(nome)
			{
			case "ram":
				ram = new Ram("Ram generica","",30,Integer.parseInt(campo.getTextContent()));
				break;
				
			default:
				break;
			}
			
			System.out.println(campo.getNodeName()+":"+campo.getTextContent());
		}
		
		pc = new PC(processore, ram, hd);
		
		double somma = 0;
		double media = 0;
		for (int i = 0; i < l.getLength(); i++){
			Node n = l.item(i);
			somma+= Integer.parseInt(n.getTextContent());
		}
		media = somma/2;
		System.out.println("Ecco la media della colazione è:" + media);
	}

}
