package xsd;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

public class XSDValidate {

	public void checkXMLFile(String xmlFilePath, String xmlFileName, String xsdFilePath, String xsdFileName){
		
		String xml = xmlFilePath+xmlFileName;
		String xsd = xsdFilePath+xmlFileName;
		
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			dbf.setValidating(true);
			
			dbf.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage", "http://www.w3.org/2001/XMLSchema");
			
			if(xsd != null) {
				dbf.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaSource", xsd);
			}
			
			DocumentBuilder db = dbf.newDocumentBuilder();
			db.setErrorHandler(new ErrorHandler() {
				public void error(SAXParseException exception) {
					System.out.println(
							"Error: URI=" + exception.getSystemId()
							+ ", Line=" + exception.getLineNumber()
							+ ", Column=" + exception.getColumnNumber());
					System.out.println(exception.getMessage());
					System.out.println();
				}
				public void fatalError(SAXParseException exception) {}
				public void warning(SAXParseException exception) {}
			});
			db.parse(xml);
			System.out.println("ha controllato.");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
