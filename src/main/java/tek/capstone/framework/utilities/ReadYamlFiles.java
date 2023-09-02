package tek.capstone.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import org.yaml.snakeyaml.Yaml;

public class ReadYamlFiles {
	// Declaring a private static variable for storing the singleton instance.
	private static ReadYamlFiles readYamlFiles;
	// Declaring a HashMap variable for storing properties.
	private HashMap<String, Object> propertyMap; 

    // Constructor for ReadYamlFiles.
	// filepath is the path of the YAML file to read
	// throws FileNotFoundException if the specified file does not exist
	private ReadYamlFiles(String filepath) throws FileNotFoundException {
		// Creating a FileInputStream for the specified file path.
		FileInputStream fileInputStream = FileUtility.getFileInputStream(filepath); 
		// Creating a new instance of the Yaml class.
		Yaml yaml = new Yaml();
		// Loading the YAML file into the propertyMap HashMap.
		this.propertyMap = yaml.load(fileInputStream); 
	}
	// Retrieves the singleton instance of ReadYamlFiles. filePath the path of the YAML file to read
	// return the singleton instance of ReadYamlFiles
	// throws FileNotFoundException if the specified file does not exist
	public static ReadYamlFiles getInstance(String filePath) throws FileNotFoundException {
		// Checking if the singleton instance is null.
		if (readYamlFiles == null)
			// Creating a new instance of ReadYamlFiles if it doesn't,exist.
			readYamlFiles = new ReadYamlFiles(filePath); 
		// Returning the singleton instance of ReadYamlFiles.											
		return readYamlFiles; 
	}
	//Retrieves the YAML property associated with the specified key.
	// key the key to retrieve the property for
	// return the YAML property associated with the key
	public HashMap getYamlProperty(String key) {
		// Returning the YAML property associated with the specified key.
		return(HashMap) this.propertyMap.get(key); 
	}
}
