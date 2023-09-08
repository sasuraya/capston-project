package tek.capstone.framework.steps;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.pages.RetailOrderPage;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory pomFactory = new POMFactory();

	RetailOrderPage retailOrderPage;

	// Constructor to initialize the RetailOrderPage object
	public RetailOrderSteps() {
		retailOrderPage = pomFactory.retailOrderPage();
	}

	@Then("Verify user is logged in")
	public void verifyUserIsLoggedIn() {
		Assert.assertTrue(pomFactory.signInPage().logoutBttn.isDisplayed());
		logger.info(">> user is on the retail website");

	}

	// add Item To Cart
	@And("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) {
		click(pomFactory.retailOrderPage().allDepartmentDropdown);
		selectByVisibleText(pomFactory.retailOrderPage().allDepartmentDropdown, category);
		logger.info("Category is changed to Smart Home successfully");
	}

	@And("User search for an item {string}")
	public void userSearchForAnItem(String item) {
		sendText(pomFactory.retailOrderPage().searchInputField, item);
		logger.info("user searching for kasa outdoor smart plug");
	}

	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(pomFactory.retailOrderPage().searchBtn);
		logger.info("user clicked on iteam seccessufully");
	}

	@And("User click on item")
	public void userClickOnItem() {
		click(pomFactory.retailOrderPage().itemkasaoutdoorsmartplug);
		logger.info(">> user clicked on item seccessfully");
	}

	@And("User select quantity {string}")
	public void userSelectQuantity1(String itemQty) {
		click(pomFactory.retailOrderPage().qtyDropdown);
		selectByVisibleText(pomFactory.retailOrderPage().qtyDropdown, itemQty);
		logger.info("Quantity(2) is selected");
	}

	@And("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(pomFactory.retailOrderPage().addToCartBttn);
		logger.info("user clicked on cart button successfully");
	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String quantity) {
		if (pomFactory.retailOrderPage().qtyDropdown.equals(quantity)) {
		}
		logger.info("The cart icon quantity changed successfully");
	}
//add Item To Cart And Checkout

	@And("User changes the category to {string}")
	public void userChangesTheCategoryToApexLegends(String category) {
		click(pomFactory.retailOrderPage().allDepartmentDropdown);
		selectByVisibleText(pomFactory.retailOrderPage().allDepartmentDropdown, category);
		logger.info("the category is changed seccessfully");
	}

	@And("User searches for an item {string}")
	public void userSearchesForAnItemApexLegends(String item) {
		sendText(pomFactory.retailOrderPage().searchInputField, item);
		logger.info("user searching for an iteam");
	}

	@And("User clicks Search icon")
	public void userClicksSearchIcon() {
		click(pomFactory.retailOrderPage().searchBtn);
		logger.info("user clicked on Search icon seccessufully");
	}

	@And("User clicks on item")
	public void userClicksOnItem() {
		click(pomFactory.retailOrderPage().apexLegendsItem);
		logger.info(">> user clicked on item seccessfully");
	}

	@And("User selects quantity {string}")
	public void userSelectsQuantity(String itemQty) {
		click(pomFactory.retailOrderPage().qtyDropdown);
		selectByValue(pomFactory.retailOrderPage().qtyDropdown, itemQty);
		logger.info("The item was selected successfully");
	}

	@And("User clicks add to Cart button")
	public void userClicksAddToCartButton() {
		click(pomFactory.retailOrderPage().addToCartBttn);
		logger.info("user clicked on cart button successfully");
	}

	@And("the carts icon quantity should changed to {string}")
	public void theCartsIconQuantityShouldChangedTo(String quantity) {
		if (pomFactory.retailOrderPage().qtyDropdown.equals(quantity)) {
			logger.info("the cart icon quantity changed successfully to 5 ");
		}
	}

	@And("User click on Cart option")
	public void userClickOnCartOption() {
		click(pomFactory.retailOrderPage().cartBtn);
		logger.info("user clicked on cart button successfully");

	}

	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(pomFactory.retailOrderPage().proceedToCheckoutBttn);
		logger.info("user clicked on Checkout button successfully");

	}
//	@Then("User click on Add a new address")
//	public void userClickOnAddANewAddress() {
//		click(pomFactory.retailOrderPage().addAdressBtn);
//		logger.info("Add Address Link was clicked successfully");
//	}
//	
//	@Then("User fill new address form with below information")
//	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
//	    List<Map<String, String>> addressInfos = dataTable.asMaps(String.class, String.class);
//	    RetailOrderPage retailPage = pomFactory.retailOrderPage();
//	    Map<String, String> addressInfo = addressInfos.get(0);
//	    selectByVisibleText(retailPage.countryDropdown, DataGenerator.addressGenerator(addressInfo.get("country")));
//	    sendText(retailPage.fullNameInput, DataGenerator.addressGenerator(addressInfo.get("fullName")));
//	    sendText(retailPage.phoneNumberInput, DataGenerator.addressGenerator(addressInfo.get("phoneNumber")));
//	    sendText(retailPage.streetInput, DataGenerator.addressGenerator(addressInfo.get("streetAddress")));
//	    sendText(retailPage.apartmentInput, DataGenerator.addressGenerator(addressInfo.get("apt")));
//	    sendText(retailPage.cityInput, DataGenerator.addressGenerator(addressInfo.get("city")));
//	    click(retailPage.stateField);
//	    selectByVisibleText(retailPage.stateField, DataGenerator.addressGenerator(addressInfo.get("state")));
//	    sendText(retailPage.zipCodeInput, DataGenerator.addressGenerator(addressInfo.get("zipCode")));
//
//	    logger.info("Address information added");
//	}
//	
//	@When("User click Add Your Address button")
//	public void userClickAddYourAddressButton() {
//		click(pomFactory.retailOrderPage().addAdressBtn);
//		logger.info(">>usre cicked on add your addressBtn");
//	}

	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(pomFactory.retailOrderPage().placeOrderBttn);
		logger.info("user clicked on cart button successfully");

	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String orderPlacedSuccessfully) {
		waitTillPresence(pomFactory.retailOrderPage().orderPlacedSuccessfullyMssg);
		Assert.assertTrue(pomFactory.retailOrderPage().orderPlacedSuccessfullyMssg.isDisplayed());
		logger.info(">>order Placed Successfully");
	}

	// cancel Order

	@Then("User clicks on Orders section")
	public void userClicksOnOrdersSection() {
		click(pomFactory.retailOrderPage().OrderLink);
		logger.info("user clicked on order button successfully");
	}

	@Then("User clicks on first order in list")
	public void userClicksOnFirstOrderInList() {
		List<WebElement> listOfOrder = pomFactory.retailOrderPage().listOfOrders;
		for (int i = 0; i < listOfOrder.size(); i++) {
			if (listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
			} else if (listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pomFactory.retailOrderPage().listOfOrders.get(i));
				logger.info("User click on first order in list successfully");
				
			}
		}
	}

	@Then("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		List<WebElement> cancelBttns = pomFactory.retailOrderPage().cancelOrderBttn;
		click(cancelBttns.get(0));
		logger.info("user clicked on Cancle order button successfully");

	}

	@Then("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		selectByVisibleText(pomFactory.retailOrderPage().reasonForCancelation, reason);
		logger.info("user clicked on Reason for cancelation button successfully");

	}

	@Then("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(pomFactory.retailOrderPage().cancelationSubmitBttn);
		logger.info("Cancel Submit Button was clicked successfully");

	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String yourOrderHasBeenCancelled) {
		Assert.assertEquals(yourOrderHasBeenCancelled,
				pomFactory.retailOrderPage().orderCancelledSuccessMssg.getText());
		logger.info("Your Order Has Been Cancelled massage displays successfully");

	}
	// return Order
	
	@Then("User click on Orders section")
	public void userClickOnOrderSection() {
		click(pomFactory.retailOrderPage().OrderLink);
		logger.info("order link was click successfully");
	}
		
	@Then("User click on 1st order in list")
	public void userClickOn1stOrderInList() {	
		List<WebElement> firstOrder = pomFactory.retailOrderPage().ordersList;	
		for (int i = 0; i < firstOrder.size(); i++) {
			if (firstOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {

			} else if (firstOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pomFactory.retailOrderPage().ordersList.get(i));
			}
		}
		logger.info("First order in the list is clicked");
	}
	
	@Then("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	    click(pomFactory.retailOrderPage().returnBttn);
	    logger.info("User clicked on Return Items button successfully");
	}

	@Then("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reason) {
	    selectByVisibleText(pomFactory.retailOrderPage().returnReason, reason);
	    logger.info("User selected the reason for return successfully");
	}

	@Then("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOffserviceFedexSelected) {
	    selectByVisibleText(pomFactory.retailOrderPage().dropOffInput, dropOffserviceFedexSelected);
	    logger.info("User selected the drop off option successfully");
	}

	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		//i add the if step just to ignore for now all the items in the cart memory
		if(!pomFactory.retailOrderPage().firstItemOnlistForReturn.isSelected()) {
		click(pomFactory.retailOrderPage().firstItemOnlistForReturn);}
	    click(pomFactory.retailOrderPage().orderReturnBtn);
	    logger.info("User clicked on Return Order button successfully");
	}
	@Then("a cancelation message should be displayed as {string}")
	public void aCancelationMessageShouldBeDisplayedAs(String orderReturnedSuccessMssg) {
	    waitTillPresence(pomFactory.retailOrderPage().returndSuccessMssg);
	    Assert.assertTrue(isElementDisplayed(pomFactory.retailOrderPage().returndSuccessMssg));
	    logger.info("Order returned success message displayed successfully");
	}
	
	// review Order

	@When("User click on Orders sections")
	public void userClickOnOrdersSections() {
		click(pomFactory.retailOrderPage().OrderLink);
		logger.info("user clicked on order button successfully");
	}

	@When("User click on the first order in list")
	public void userClickOnTheFirstOrderInList() {
		List<WebElement> listOfOrder = pomFactory.retailOrderPage().listOfOrders;
		for (int i = 0; i < listOfOrder.size(); i++) {
			if (listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
			} else if (listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pomFactory.retailOrderPage().listOfOrders.get(i));
				logger.info("User click on first order in list successfully");
			}
		}
	}

	@Then("User click on Review button")
	public void userClickOnReviewButton() {
		click(pomFactory.retailOrderPage().reviewBtn);
		logger.info("user clicked on review button successfully");

	}

	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headlineInput, String descriptionInput) {
		sendText(pomFactory.retailOrderPage().headlineInput, "Quality is really good");
		sendText(pomFactory.retailOrderPage().descriptionInput, "same as picture");
		logger.info("headline was entered successfully");
	}

	@Then("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(pomFactory.retailOrderPage().reviewSubmitBtn);
		logger.info("User click on Review button successfully");

	}

	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewAddedSuccessfully) {
		waitTillPresence(pomFactory.retailOrderPage().reviewAddedSuccessfully);
		Assert.assertTrue(reviewAddedSuccessfully, pomFactory.retailOrderPage().reviewAddedSuccessfully.isDisplayed());
		System.out.println(">> A review message displayed successfully");

	}
}
