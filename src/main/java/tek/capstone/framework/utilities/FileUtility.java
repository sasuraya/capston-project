package tek.capstone.framework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtility {
	/**
	 * fileinputstream class helps to read sequential data from a source
       file input stream is used to get data from the file
       
     * Retrieves a FileInputStream for the specified file path.
     * @param filePath the path of the file to retrieve the input stream for
     * @return a FileInputStream for the specified file
     * @throws FileNotFoundException if the file specified by the filePath does not exist
     */

	 public static FileInputStream getFileInputStream(String filePath) 
			 throws FileNotFoundException {
	        return new FileInputStream(new File(filePath));
	 }
}
