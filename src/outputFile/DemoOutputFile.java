package outputFile;

public class DemoOutputFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutputFile outputFile = new OutputFile();
		
		String filePath = "C:\\Users\\corso1\\Desktop\\";
		String fileName = "OutputFileTest.txt";
		String content = "OutputFileTest";
		
		outputFile.outputFile(filePath+fileName, content);
		
		System.out.println("Done");
	}

}
