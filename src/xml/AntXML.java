package xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import java.io.File;

public class AntXML {
//Una helper class.
//Restituisce un Document, vale a dire un documento 
//Ci sono dei problemi... dei problemi di risorse, ma per ora...

public static Document DocumentDaFile(String percorso) {
	try {
			File fXmlFile = new File(percorso);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			//trasformo file l'albero
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			return doc;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
}