package tek.capstone.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory pomFactory = new POMFactory();

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(pomFactory.retailHomePage().allOptions);
		logger.info("All Options dropdown was clicked");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> departmentOption = dataTable.asLists(String.class);
		for (int i = 0; i < departmentOption.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath(
					"//div[@class='sidebar__content']//span[text()='" + departmentOption.get(0).get(i) + "']"))));
			logger.info("Option " + departmentOption.get(0).get(i) + " is displayed");
		}
	}

	@When("User on {string}")
	public void userOn(String department) {
		List<WebElement> departments = pomFactory.retailHomePage().sidebarOptions;
		for (int i = 0; i < departments.size(); i++) {
			if (departments.get(i).getText().equalsIgnoreCase(department)) {
				departments.get(i).click();
				break;
			}
		}
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> optinInAllDeportments = dataTable.asLists(String.class);
		List<WebElement> options = pomFactory.retailHomePage().sidebarAllOption;
		for (int i = 0; i < optinInAllDeportments.get(0).size(); i++) {
			for (WebElement elements : options) {
				if (elements.getText().equalsIgnoreCase(optinInAllDeportments.get(0).get(i))) {
					Assert.assertTrue(elements.isDisplayed());
					logger.info("Option " + elements.getText() + " is displayed");
				}
			}
		}
	}
}
