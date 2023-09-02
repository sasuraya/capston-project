package tek.capstone.framework.base;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import tek.capstone.framework.config.Browser;
import tek.capstone.framework.config.ChromeBrowser;
import tek.capstone.framework.config.ChromeHeadless;
import tek.capstone.framework.config.EdgeBrowser;
import tek.capstone.framework.config.FireFoxBrowser;
import tek.capstone.framework.utilities.ReadYamlFiles;

public class BaseSetup {

	private static WebDriver webDriver;
	private final ReadYamlFiles environmentVariables;
	public static Logger logger;

	// create a constructore method for BaseSetup class
	public BaseSetup() {
		// Create 2 string variable and sign path to env_config.yml file / log4j.properties file
		String filePath = System.getProperty("user.dir") + "/src/main/resources/env_config.yml";
		String log4JPath = System.getProperty("user.dir") + "/src/main/resources/log4j.properties";
		try {
		// ReadYamlFiles class is risky code,we use try/catch block to handle FileNotFoundException
		// by first Initializeing ReadYamlFiles Object
			environmentVariables = ReadYamlFiles.getInstance(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("Failed for Load environment context. check possible file path errors");
			throw new RuntimeException("Failed for Load environment context with message " + e.getMessage());
		}
		// Initialze Logger out side of try/catch block
		logger = Logger.getLogger("logger_File");
// Call Configure method of PropertyConfigurator class and pass log4jPath variable.
		PropertyConfigurator.configure(log4JPath);
	}
	// Create a public method that returns WebDriver
	public WebDriver getDriver() {
		return webDriver;
	}
    public void setupBrowser() {
        HashMap uiProperties = environmentVariables.getYamlProperty("ui");
        System.out.println(uiProperties);
        String url = uiProperties.get("url").toString();
        Browser browser;
        switch (uiProperties.get("browser").toString().toLowerCase()) {
        case "chrome":
            if ((boolean) uiProperties.get("headless")) {
                browser = new ChromeHeadless();
            } else {
                browser = new ChromeBrowser();
            }
            webDriver = browser.openBrowser(url);
            break;
        case "firefox":
            browser = new FireFoxBrowser();
            webDriver = browser.openBrowser(url);
            break;
        case "edge":
            browser = new EdgeBrowser();
            webDriver = browser.openBrowser(url);
            break;
        default:
            throw new RuntimeException("Unknown Browser check environment properties");
        }
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    }

	public void quitBrowser() {
		if (webDriver != null)
			webDriver.quit();
	}
}
