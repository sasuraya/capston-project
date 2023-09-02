package tek.capstone.framework.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.capstone.framework.utilities.CommonUtility;
public class BaseUITest extends CommonUtility {
	//here we create our hooks wiches @Before    @After
	//We use @Before, before each test case we want the browser to initialize
	//We use @After , once we run our test we want to take screenshot and the browsers to be closed
    @Before
    public void setupTests() {
        super.setupBrowser();
    }
    @After
    public void closeTests(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenShot = takeScreenShotAsBytes();
            scenario.attach(screenShot, "iamge/png", scenario.getName() + " scenario Failed");
        }
        super.quitBrowser();
    }
}
