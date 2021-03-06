
package outputFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputFile {

	public void outputFile(String filePath, String content) {
		FileOutputStream fop = null;
		File file;
		//String content = "This is the text content";
		
		try {
			file = new File(filePath);
			fop = new FileOutputStream(file);
			
			// if file doesn't exists, then create it
			if(!file.exists()){
				file.createNewFile();
			}
			
			// get the content in bytes
			byte[] contentInBytes = content.getBytes();
			
			fop.write(contentInBytes);
			fop.flush();
			fop.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
