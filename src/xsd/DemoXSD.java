package xsd;

public class DemoXSD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XSDValidate xsdValidate = new XSDValidate();
		
		xsdValidate.checkXMLFile("C:\\Users\\corso1\\Desktop\\", "ram.xml", "C:\\Users\\corso1\\Desktop\\", "xsd.txt");
	}

}
