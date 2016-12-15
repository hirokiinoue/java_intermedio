package negozio;

import outputFile.OutputFile;;

public class DemoXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ram ram = new Ram("SAMUSUNG DDR3","", 150.00, 4, "DDR3");
		OutputFile outputFile = new OutputFile();

		String filePath = "C:\\Users\\corso1\\Desktop\\";
		String fileName = "ram.xml";
		String content = ram.toXML();
		
		outputFile.outputFile(filePath+fileName, content);

		System.out.println("Done");
	}

}
