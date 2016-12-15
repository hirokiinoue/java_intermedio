package xml;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DemoAntXML {
	public static void main(String argv[])
	{
		//Un bel lavoro
		//Dovrete ragione e scrivere una Facade di metodi statici.
		//Questo sarà il vostro lavoro principale, per oggi e in seguito
		//XML - un ottimo sistema per memorizzare ma soprattutto assorbire i dati
		//E la configurazione
		Document dati = AntXML.DocumentDaFile("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\dati.xml");
		NodeList l = dati.getElementsByTagName("calories");
		int somma = 0;
		for(int i=0;i<l.getLength();i++)
		{
			Node n = l.item(i);
			somma+= Integer.parseInt(n.getTextContent()); 
		}
			System.out.println("Ecco cosa assumo se mangio tutto il menù:"+somma);
			
			System.out.println("La mia radice è:"+dati.getDocumentElement().getNodeName());
			System.out.println("Che ricette ho?");
			NodeList figli = dati.getDocumentElement().getChildNodes();
		for(int i=0;i<figli.getLength();i++)
		{
			Node n = figli.item(i);
			if(n.hasChildNodes()) System.out.println(n.getChildNodes().item(1).getTextContent()); 
		}
	
	}
}